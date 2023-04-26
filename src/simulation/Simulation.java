package simulation;

import interfaces.generalEntity.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.Boar;
import objects.inhabitans.animals.omnivores.Duck;
import objects.inhabitans.animals.omnivores.Mouse;
import objects.inhabitans.animals.predators.*;
import objects.inhabitans.plants.Grass;
import objects.inhabitans.virus.Covid;
import objects.island.Island;
import objects.island.Сell;


@Getter
@Setter
public class Simulation {

    private static int day = 1; // 1 day = 5 cycle

    public void mainSimulation(int countDay, Island island) {
        while (day != countDay) {
            for (Сell[] cells : island.getСells()) {
                for (Сell currentCell : cells) {
                    new MoveSimulation().moveIterator(island, currentCell, currentCell.getResidentList());
                    for (int i = 0; i < currentCell.getResidentList().size(); i++) {
                        if (currentCell.getResidentList().get(i) instanceof Grass grass) {
                            grass.setPlusGrowGrass(1);
                        }
                    }
                }
            }
            printStatistic(island, day);
            for (Сell[] cells : island.getСells()) {
                for (Сell currentCell : cells) {
                    currentCell.setResidentList(new MultiplySimulation().multiplyIterator(currentCell.getResidentList()));
                }
            }
            printStatistic(island, day);
            for (Сell[] cells : island.getСells()) {
                for (Сell currentCell : cells) {
                    currentCell.setResidentList(new EatSimulation().eatIterator(currentCell.getResidentList()));
                }
            }
            printStatistic(island, day);
            EnergyMinusSimulation.energyMinus(island);
            day++;
        }

    }

    public void printStatistic(Island island, int day) {

        System.out.println("Day:" + day);
        printAnimalСounting(island);
        System.out.println("+".repeat(100));
    }

    public void printAnimalСounting(Island island) {
        int animalCount = 0;
        int herbivoresCount = 0;
        int omnnivoresCount = 0;
        int predatorsCount = 0;
        int plantCount = 0;
        int virusCount = 0;
        int buffaloCount = 0;
        int caterpillarCount = 0;
        int deerCount = 0;
        int goatCount = 0;
        int horseCount = 0;
        int rabbitCount = 0;
        int sheepCount = 0;
        int boarCount = 0;
        int duckCount = 0;
        int mouseCount = 0;
        int bearCount = 0;
        int boaCount = 0;
        int eagleCount = 0;
        int foxCount = 0;
        int wolfCount = 0;
        int grassCount = 0;
        int covidCount = 0;
        String buffaloIcon = "\uD83D\uDC03";
        String caterpillarIcon = "\uD83D\uDC1B";
        String deerIcon = "\uD83E\uDD8C";
        String goatIcon = "\uD83D\uDC10";
        String horseIcon = "\uD83D\uDC34";
        String rabbitIcon = "\uD83D\uDC07";
        String sheepIcon = "\uD83D\uDC11";
        String boarIcon = "\uD83D\uDC17";
        String duckIcon = "\uD83E\uDD86";
        String mouseIcon = "\uD83D\uDC01";
        String bearIcon = "\uD83D\uDC3B";
        String boaIcon = "\uD83D\uDC0D";
        String eagleIcon = "\uD83E\uDD85";
        String foxIcon = "\uD83E\uDD8A";
        String wolfIcon = "\uD83D\uDC3A";
        String grassIcon = "\uD83C\uDF31";
        String covidIcon = "\uD83E\uDDA0";

        for (Сell[] cells : island.getСells()) {
            for (Сell cell : cells) {
                for (Resident resident : cell.getResidentList()) {
                    if (resident instanceof Buffalo) {
                        buffaloCount++;
                        herbivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Caterpillar) {
                        caterpillarCount++;
                        herbivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Deer) {
                        deerCount++;
                        herbivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Goat) {
                        goatCount++;
                        herbivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Horse) {
                        horseCount++;
                        herbivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Rabbit) {
                        rabbitCount++;
                        herbivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Sheep) {
                        sheepCount++;
                        herbivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Boar) {
                        boarCount++;
                        omnnivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Duck) {
                        duckCount++;
                        omnnivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Mouse) {
                        mouseCount++;
                        omnnivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Bear) {
                        bearCount++;
                        predatorsCount++;
                        animalCount++;
                    } else if (resident instanceof Boa) {
                        boaCount++;
                        predatorsCount++;
                        animalCount++;
                    } else if (resident instanceof Eagle) {
                        eagleCount++;
                        predatorsCount++;
                        animalCount++;
                    } else if (resident instanceof Fox) {
                        foxCount++;
                        predatorsCount++;
                        animalCount++;
                    } else if (resident instanceof Wolf) {
                        wolfCount++;
                        predatorsCount++;
                        animalCount++;
                    } else if (resident instanceof Covid) {
                        covidCount++;
                        predatorsCount++;
                        virusCount++;
                    } else if (resident instanceof Grass) {
                        grassCount++;
                        plantCount++;
                    }
                }
            }
        }
        System.out.println("Animals: " + animalCount + " Herbivores: " + herbivoresCount
                + " Omnivores: " + omnnivoresCount + " Predators: " + predatorsCount
                + " Plant: " + plantCount + " Virus: " + virusCount);
        System.out.println(buffaloIcon + " " + buffaloCount + " " + caterpillarIcon + " " + caterpillarCount + " " + deerIcon + " " +
                deerCount + " " + goatIcon + " " + goatCount + " " + horseIcon + " " + horseCount + " " + rabbitIcon + " " + rabbitCount + " " +
                sheepIcon + " " + sheepCount + " " + boarIcon + " " + boarCount + " " + duckIcon + " " + duckCount + " " + mouseIcon + " " + mouseCount
                + " " + bearIcon + " " + bearCount + " " + boaIcon + " " + boaCount + " " + eagleIcon + " " + eagleCount + " " + foxIcon + " " + foxCount
                + " " + wolfIcon + " " + wolfCount + " " + grassIcon + " " + grassCount + " " + covidIcon + " " + covidCount);
    }
}


