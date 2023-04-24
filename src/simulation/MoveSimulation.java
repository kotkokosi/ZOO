package simulation;

import exceptions.NoMovesException;
import interfaces.generalEntity.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Coordinate;
import objects.island.Island;
import objects.island.Сell;

public class MoveSimulation {
    public static void moveAnimal(Island island, Сell currentCell, int animalNumber) {
                    Resident resident = currentCell.removeResidentToList(animalNumber);
                    currentCell.getCheckMaxQuantityPerCell().checkMinusQuantityPerCell(resident);
                    if (!(resident instanceof Animal animal)) {
                        moveNotAllowed(island, currentCell, resident, animalNumber);
                    } else {
                        moveAllowed(island, currentCell, animal);
                    }
    }

    private static void moveNotAllowed(Island island, Сell currentCell, Resident resident, int animalNumber) {
        island.deliveryAnimal(resident, currentCell.getCoordinate().getCoordinateX(),
                currentCell.getCoordinate().getCoordinateY(), animalNumber);
        currentCell.getCheckMaxQuantityPerCell().checkPlusQuantityPerCellGeneration(resident);
    }

    private static void moveAllowed(Island island, Сell currentCell, Animal animal) {
        int attempts = 20000;
        while ((attempts--) > 0) {
            Coordinate cor = animal.selectDirection(currentCell);
            if (isValidCoordinate(cor, island.getСells().length, island.getСells().length)) {
                if (currentCell.getCheckMaxQuantityPerCell().checkPlusQuantityPerCellRunning((Resident) animal)) {
                    if (attempts == 1) {
                        throw new NoMovesException("No moves!!!");
                    }
                } else {
                    island.deliveryAnimal((Resident) animal, cor.getCoordinateX(), cor.getCoordinateY());
                    attempts = 0;
                }
            }
        }
    }

    private static boolean isValidCoordinate(Coordinate cor, int islandSizeX, int islandSizeY) {
        return cor.getCoordinateX() >= 0 && cor.getCoordinateX() < islandSizeX &&
                cor.getCoordinateY() >= 0 && cor.getCoordinateY() < islandSizeY;
    }
}
