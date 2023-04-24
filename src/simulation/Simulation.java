package simulation;

import interfaces.generalEntity.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.Animal;
import objects.inhabitans.animals.herbivores.Herbivore;
import objects.inhabitans.animals.omnivores.Omnivore;
import objects.inhabitans.animals.predators.Predator;
import objects.inhabitans.plants.Plant;
import objects.inhabitans.virus.Virus;
import objects.island.Island;
import objects.island.Сell;

import java.util.Random;

@Getter
@Setter
public class Simulation {
    private static int day = 0; // 1 day = 5 cycle

    public void mainSimulation(int countDay, Island island) {
        printStatistic(island);
        while (day < countDay) {
            for (int i = 0; i < 5; i++) {
                for (Сell[] cells : island.getСells()) {
                    for (Сell currentCell : cells) {
                        for (int residentIndex = 0; residentIndex < currentCell.getResidentList().size(); residentIndex++) {
                            chooseAction(new Random().nextInt(1, 3), island, currentCell, residentIndex);

                        }
                    }
                }

            }
            EnergyMinusSimulation.energyMinus(island);
            printStatistic(island);
            day++;
        }
    }

    public void chooseAction(int random, Island island, Сell currentCell, int animalNumber) {
        switch (random) {
            case 1 -> MoveSimulation.moveAnimal(island, currentCell, animalNumber);
            case 2 -> EatSimulation.eatAnimal(currentCell, animalNumber);
        }
    }

    public void printStatistic(Island island){
        //printIsland(island);
        System.out.println("#".repeat(100));
        printAnimalСounting(island);
        System.out.println("#".repeat(100));
    }

    public static void printIsland(Island island) {
        for (Сell[] cells : island.getСells()) {
            for (Сell cell : cells) {
                for (Resident resident : cell.getResidentList()) {
                    System.out.println("Coordinate  X: " + cell.getCoordinate().getCoordinateX()
                            + " Coordinate Y : " + cell.getCoordinate().getCoordinateY());
                    System.out.print(resident.getName() + " ");
                    System.out.print(resident.getIcon() + " ");
                    System.out.print(resident.getWeight() + " ");
                    System.out.print(resident.getMaxQuantityPerCell() + " ");
                    System.out.print(resident.getFoodRequiredForSatiation() + " ");
                    System.out.print(resident.getMovementSpeed() + " ");
                    System.out.print(resident.getMovementSpeed() + " ");
                    System.out.println(resident.getEatingRiskMap() + " ");
                }
                System.out.println("-".repeat(15));
            }
        }
    }

    public static void printAnimalСounting(Island island) {
        int animalCount = 0;
        int herbivoresCount = 0;
        int omnnivoresCount = 0;
        int predatorsCount = 0;
        int plantCount = 0;
        int virusCount = 0;

        for (Сell[] cells : island.getСells()) {
            for (Сell cell : cells) {
                for (Resident resident : cell.getResidentList()) {
                    if (resident instanceof Herbivore) {
                        herbivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Omnivore) {
                        omnnivoresCount++;
                        animalCount++;
                    } else if (resident instanceof Predator) {
                        predatorsCount++;
                        animalCount++;
                    }else if (resident instanceof Plant) {
                        plantCount++;
                    } else if (resident instanceof Virus) {
                        virusCount++;
                    }
                }
            }
        }
        System.out.println("Animals: " + animalCount + " Herbivores: " + herbivoresCount
                + " Omnivores: " + omnnivoresCount + " Predators: " + predatorsCount
                + " Plant: " + plantCount + " Virus: " + virusCount);
    }

}


