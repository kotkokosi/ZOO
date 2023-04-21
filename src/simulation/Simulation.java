package simulation;

import exceptions.NoMovesException;
import interfaces.generalEntity.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.Animal;
import objects.inhabitans.plants.Plant;
import objects.inhabitans.virus.Covid;
import objects.island.Coordinate;
import objects.island.Island;
import objects.island.Сell;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Simulation {
    private static int day = 0;

//    public void mainSimulation(int countDay) {
//        for (int i = 0; i < countDay; i++) {
//
//        }
//    }


    public void moveAnimal(Island island) {
        for (Сell[] cells : island.getСells()) {
            for (Сell currentCell : cells) {
                for (int residentIndex = 0; residentIndex < currentCell.getResidentList().size(); residentIndex++) {
                    Resident resident = currentCell.removeResidentToList();
                    currentCell.getCheckMaxQuantityPerCell().checkMinusQuantityPerCell(resident);
                    if (!(resident instanceof Animal animal)) {
                        moveNonAnimalResident(island, currentCell, resident);
                    } else {
                        moveAnimalResident(island, currentCell, animal);
                    }
                }
            }
        }
    }

    private void moveNonAnimalResident(Island island, Сell currentCell, Resident resident) {
        island.deliveryAnimal(resident, currentCell.getCoordinate().getCoordinateX(),
                currentCell.getCoordinate().getCoordinateY());
        currentCell.getCheckMaxQuantityPerCell().checkPlusQuantityPerCell(resident);
    }

    private void moveAnimalResident(Island island, Сell currentCell, Animal animal) {
        int attempts = 20000;
        while ((attempts--) > 0) {
            Coordinate cor = animal.selectDirection(currentCell);
            if (isValidCoordinate(cor, island.getСells().length, island.getСells().length)) {
                if (!currentCell.getCheckMaxQuantityPerCell().checkPlusQuantityPerCell((Resident) animal)) {
                    island.deliveryAnimal((Resident) animal, cor.getCoordinateX(), cor.getCoordinateY());
                    attempts = 0;
                } else if (attempts == 1) {
                    throw new NoMovesException("No moves!!!");
                }
            }
        }
    }

    private boolean isValidCoordinate(Coordinate cor, int islandSizeX, int islandSizeY) {
        return cor.getCoordinateX() >= 0 && cor.getCoordinateX() < islandSizeX &&
                cor.getCoordinateY() >= 0 && cor.getCoordinateY() < islandSizeY;
    }

    //--------------------------------------------------------------------------------------
    public void eatAnimal(Island island) {
        for (Сell[] cells : island.getСells()) {
            for (Сell currentCell : cells) {
                currentCell.setResidentList(enumerationAnimalEat(currentCell.getResidentList()));
            }
        }
    }

    private List<Resident> enumerationAnimalEat(List<Resident> residentList) {
        Set<Integer> animalsToRemove = new HashSet<>();
        for (int i = 0; i < residentList.size(); i++) {
            for (int j = 0; j < residentList.size(); j++) {
                if (residentList.get(i) instanceof Plant) {
                    continue;
                }
                if (residentList.get(i) instanceof Animal animal) {
                    if (animal.isDeadly(residentList.get(j))) {
                        animal.setEnergy(residentList.get(j).getEnergy());
                        animalsToRemove.add(j);
                    }
                } else {
                    Covid covid = (Covid) residentList.get(i);
                    if (covid.isDeadly(residentList.get(j))) {
                        animalsToRemove.add(j);
                    }
                }
            }
        }
        return iteratorAnimalEat(animalsToRemove, residentList);
    }

    private List<Resident> iteratorAnimalEat(Set<Integer> animalsToRemove, List<Resident> residentList) {
        Iterator<Resident> iterator = residentList.iterator();
        int currentIndex = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (animalsToRemove.contains(currentIndex)) {
                iterator.remove();
            }
            currentIndex++;
        }
        return residentList;
    }

//--------------------------------------------------------------------------------------


}


