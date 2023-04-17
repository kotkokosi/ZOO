package simulation;

import interfaces.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.Animal;
import objects.island.Island;
import objects.island.Сell;

import java.util.ArrayList;

@Getter
@Setter
public class Simulation {
    private static int day = 0;

    public void moveEntity(Island island) {
        for (int i = 0; i < island.getСells().length; i++) {
            for (int j = 0; j < island.getArrayСells(i).length; j++) {
                Сell currentCell = island.getConcreteCell(i, j);
                for (Resident animal : currentCell.getResidentAndRemove()) {
                    if (!(animal instanceof Animal)) {continue;}
                    while (true) {
//                        System.out.println("Name: " + animal.getIcon() + " Current coordinateX: " +
//                                currentCell.getCoordinate().getCoordinateX() + " Current coordinateY: " +
//                                currentCell.getCoordinate().getCoordinateY());
                        int moveX = currentCell.getCoordinate().getCoordinateX()
                                + ((Animal) animal).multiply().getCoordinateX();
                        int moveY = currentCell.getCoordinate().getCoordinateY()
                                + ((Animal) animal).multiply().getCoordinateY();
                        if (moveX >= 0 && moveX < island.getСells().length &&
                                moveY >= 0 && moveY < island.getArrayСells(i).length){
                            island.deliveryAnimal((Animal) animal, moveX, moveY);
                            break;
                        }
                    }
                }
            }
        }
    }
}
