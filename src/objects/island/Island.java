package objects.island;

import generator.GeneratorListEntity;
import interfaces.generalEntity.Resident;
import lombok.Setter;

import java.util.ArrayList;

@Setter
public class Island {
    private final int islandHeight;
    private final int islandWeight;
    private Сell[][] сells;

    public Сell getConcreteCell(int first, int second) {
        return сells[first][second];
    }

    public Сell[] getArrayСells(int first) {
        return сells[first];
    }

    public Сell[][] getСells() {
        return сells;
    }

    public Island(int islandHeight, int islandWeight) {
        this.islandHeight = islandHeight;
        this.islandWeight = islandWeight;
        сells = new Сell[islandWeight][islandHeight];
    }


    public void islandFill() {
        int r = 0;
        for (int i = 0; i < islandHeight; i++) {
            for (int j = 0; j < islandWeight; j++) {
                сells[i][j] = new Сell(i, j, new ArrayList<>());
                сells[i][j].setResidentList(new GeneratorListEntity().
                        generateListEntity(сells[i][j].getCheckMaxQuantityPerCell()));
                System.out.println("#".repeat(r++));
            }
        }
    }

//    public void islandFillForTest() {
//        for (int i = 0; i < islandHeight; i++) {
//            for (int j = 0; j < islandWeight; j++) {
//                if (i == 5 && j == 5) {
//                    сells[5][5] = new Сell(5, 5, (ArrayList<Resident>) new GeneratorListEntity().generateListEntity());
//                    continue;
//                }
//                сells[i][j] = new Сell(i, j, new ArrayList<>());
//            }
//        }
//    }

    public void deliveryAnimal(Resident animal, int moveX, int moveY) {
        сells[moveX][moveY].addResidentToList(animal);
    }

    public void deliveryAnimal(Resident animal, int moveX, int moveY, int animalNumber) {
        сells[moveX][moveY].addResidentToListWithNumber(animal, animalNumber);
    }
}
