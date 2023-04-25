package simulation;

import exceptions.NoMovesException;
import interfaces.generalEntity.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Coordinate;
import objects.island.Island;
import objects.island.Сell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoveSimulation {

    public void moveIterator(Island island, Сell currentCell, List<Resident> residentList){
        Iterator<Resident> iterator = residentList.iterator();
        currentCell.setResidentList(new ArrayList<>());
        while (iterator.hasNext()) {
            moveAnimal(island, currentCell, iterator.next());
            iterator.remove();
        }
    }

    private void moveAnimal(Island island, Сell currentCell, Resident resident) {
                    currentCell.getCheckMaxQuantityPerCell().checkMinusQuantityPerCell(resident);
                    if (!(resident instanceof Animal animal)) {
                        moveNotAllowed(island, currentCell, resident);
                    } else {
                        moveAllowed(island, currentCell, animal);
                    }
    }

    private void moveNotAllowed(Island island, Сell currentCell, Resident resident) {
        island.deliveryAnimal(resident, currentCell.getCoordinate().getCoordinateX(),
                currentCell.getCoordinate().getCoordinateY());
        currentCell.getCheckMaxQuantityPerCell().checkPlusQuantityPerCellGeneration(resident);
    }

    private void moveAllowed(Island island, Сell currentCell, Animal animal) {
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

    private boolean isValidCoordinate(Coordinate cor, int islandSizeX, int islandSizeY) {
        return cor.getCoordinateX() >= 0 && cor.getCoordinateX() < islandSizeX &&
                cor.getCoordinateY() >= 0 && cor.getCoordinateY() < islandSizeY;
    }
}
