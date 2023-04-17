package objects.island;

import generator.GeneratorEntity;
import interfaces.Resident;
import lombok.Setter;
import objects.inhabitans.animals.Animal;

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
                сells[i][j] = new Сell(i, j, (ArrayList<Resident>) new GeneratorEntity().generateListEntity());
            }
        }
    }

    public void deliveryAnimal(Animal animal, int moveX, int moveY){
        ArrayList<Resident> list = (ArrayList<Resident>) сells[moveX][moveY].getResidentList();
        list.add((Resident) animal);
        сells[moveX][moveY].setResidentList(list);
    }
}
