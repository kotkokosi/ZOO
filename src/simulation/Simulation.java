package simulation;

import exceptions.NoMovesException;
import interfaces.generalEntity.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.Animal;
import objects.island.Island;
import objects.island.Сell;

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
                        island.deliveryAnimal(resident, currentCell.getCoordinate().getCoordinateX(),
                                currentCell.getCoordinate().getCoordinateY());
                        currentCell.getCheckMaxQuantityPerCell().checkPlusQuantityPerCell(resident);
                    } else {
                        int attempts = 20000;
                        while (attempts-- > 0) {
                            int moveX = currentCell.getCoordinate().getCoordinateX()
                                    + animal.selectDirection().getCoordinateX();
                            int moveY = currentCell.getCoordinate().getCoordinateY()
                                    + animal.selectDirection().getCoordinateY();
                            if (moveX >= 0 && moveX < island.getСells().length &&
                                    moveY >= 0 && moveY < cells.length) {
                                if (!(currentCell.getCheckMaxQuantityPerCell().checkPlusQuantityPerCell(resident))) {
                                    island.deliveryAnimal((Resident) animal, moveX, moveY);
                                    attempts = 0;
                                }else if(attempts == 1){
                                    throw new NoMovesException("No moves!!!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
