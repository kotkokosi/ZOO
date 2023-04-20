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

    public Сell getConcreteCell(int first, int second){
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
        for (int i = 0; i < islandHeight; i++) {
            for (int j = 0; j < islandWeight; j++) {
                сells[i][j] = new Сell(i, j, (ArrayList<Resident>) new GeneratorListEntity().generateListEntity());
            }
        }
    }

    public void deliveryAnimal(Resident animal, int moveX, int moveY){
        сells[moveX][moveY].addResidentToList(animal);
    }
}
