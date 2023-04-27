package handlers;

import exceptions.NoMovesException;
import interfaces.generalEntity.Resident;
import objects.inhabitans.Entity;
import objects.inhabitans.animals.Animal;
import objects.island.Coordinate;
import objects.island.Island;
import objects.island.Сell;

import java.util.Random;

public class MoveHandler {

    public void moveNotAllowed(Island island, Сell currentCell, Resident resident) {
        island.deliveryAnimal(resident, currentCell.getCoordinate().getCoordinateX(),
                currentCell.getCoordinate().getCoordinateY());
        currentCell.getCheckMaxQuantityPerCell().checkPlusQuantityPerCellGeneration(resident);
    }

    public void moveAllowed(Island island, Сell currentCell, Animal animal) {
        int attempts = 20000;
        while ((attempts--) > 0) {
            Coordinate cor = selectDirection(currentCell, animal);
            if (!isValidCoordinate(cor, island.getСells().length, island.getСells().length)) {
                continue;
            }
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

    public Coordinate selectDirection(Сell currentCell, Animal animal) {
        Random random = new Random();
        int randomX = random.nextInt((animal.getMovementSpeed() * -1), animal.getMovementSpeed() + 1);
        int randomY = random.nextInt((animal.getMovementSpeed() * -1), animal.getMovementSpeed() + 1);

        int supposedMoveX = (randomX) + currentCell.getCoordinate().getCoordinateX();
        int supposedMoveY = (randomY) + currentCell.getCoordinate().getCoordinateY();

        return new Coordinate(supposedMoveX, supposedMoveY);
    }

    private boolean isValidCoordinate(Coordinate cor, int islandSizeX, int islandSizeY) {
        return cor.getCoordinateX() >= 0 && cor.getCoordinateX() < islandSizeX &&
                cor.getCoordinateY() >= 0 && cor.getCoordinateY() < islandSizeY;
    }
}
