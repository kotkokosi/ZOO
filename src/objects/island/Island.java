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
            }
        }
    }

    public void deliveryAnimal(Resident animal, int moveX, int moveY) {
        сells[moveX][moveY].addResidentToListWithNumber(animal, 0);
    }
}
