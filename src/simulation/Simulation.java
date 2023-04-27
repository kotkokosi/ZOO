package simulation;

import handlers.EatHandler;
import handlers.PairHandler;
import interfaces.generalEntity.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.Boar;
import objects.inhabitans.animals.omnivores.Duck;
import objects.inhabitans.animals.omnivores.Mouse;
import objects.inhabitans.animals.predators.*;
import objects.inhabitans.plants.Grass;
import objects.inhabitans.virus.Virus1;
import objects.island.Island;
import objects.island.Сell;

import java.util.ArrayList;


@Getter
@Setter
public class Simulation {

    private static int day = 0;

    public void mainSimulation(int countDay, Island island) {
        while (day != countDay) {
            for (Сell[] cells : island.getСells()) {
                for (Сell currentCell : cells) {
                    ArrayList<Resident> residents = (ArrayList<Resident>) currentCell.getResidentList();
                    currentCell.setResidentList(new ArrayList<>());
                    for (Resident resident : residents) {
                        resident.move(island, currentCell);
                    }
                }
            }

            for (Сell[] cells : island.getСells()) {
                for (Сell currentCell : cells) {
                    ArrayList<Resident> residents = (ArrayList<Resident>) currentCell.getResidentList();
                    for (int j = 0; j < residents.size(); j++) {
                        for (int i = 0; i < residents.size(); i++) {
                            if (j == i) {
                                continue;
                            }
                            if(!residents.get(j).multiply(residents.get(i))){
                                i = residents.size();
                            }
                        }
                    }
                    residents.addAll(PairHandler.children);
                    currentCell.setResidentList(residents);
                }
            }

            for (Сell[] cells : island.getСells()) {
                for (Сell currentCell : cells) {
                    for (int j = 0; j < currentCell.getResidentList().size(); j++) {
                        for (int i = 0; i < currentCell.getResidentList().size(); i++) {
                            if (j == i) {
                                continue;
                            }
                            if (currentCell.getResidentList().get(i) instanceof Grass grass) {
                                if (grass.getGrowGrass() == 5) {
                                    grass.setGrowGrass(0);
                                }
                                continue;
                            }
                            currentCell.getResidentList().get(j).eat(currentCell.getResidentList().get(i));
                        }
                    }
                    currentCell.setResidentList(EatHandler.animalsDeath(currentCell.getResidentList(), EatHandler.animalsToRemove));
                }
            }

            for (Сell[] cells : island.getСells()) {
                for (Сell currentCell : cells) {
                    for (int i = 0; i < currentCell.getResidentList().size(); i++) {
                        if (currentCell.getResidentList().get(i) instanceof Grass grass) {
                            grass.setPlusGrowGrass(1);
                        }
                    }
                }
            }

            printStatistic(island, day);
            EnergyMinusSimulation.energyMinus(island);
            day++;
        }

    }

//    public static void printIsland(Island island) {
//        for (Сell[] cells : island.getСells()) {
//            for (Сell cell : cells) {
//                for (Resident resident : cell.getResidentList()) {
//                    System.out.print(resident.getName() + " ");
//                    System.out.print(resident.getIcon() + " ");
//                    System.out.print(resident.getWeight() + " ");
//                    System.out.print(resident.getMaxQuantityPerCell() + " ");
//                    System.out.print(resident.getMovementSpeed() + " ");
//                    System.out.print(resident.getFoodRequiredForSatiation() + " ");
//                    System.out.print(resident.getMovementSpeed() + " ");
//                    System.out.println(resident.getEatingRiskMap() + " ");
//                }
//                System.out.println("#".repeat(100));
//            }
//        }
//    }

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
                        animalCount++;
                    } else if (resident instanceof Horse) {
                        goatCount++;
                        herbivoresCount++;
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
                    } else if (resident instanceof Virus1) {
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


