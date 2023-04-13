import interfaces.Resident;
import objects.island.Coordinate;
import objects.island.Island;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int islandHeight;
        int islandWeight;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("ENTER ISLAND HEIGHT - ");
            islandHeight = scanner.nextInt();
            System.out.print("ENTER ISLAND WEIGHT - ");
            islandWeight = scanner.nextInt();
        }
        Island island = new Island(islandHeight, islandWeight);
        island.islandFill();
        printIsland(island);
    }

    public static void printIsland(Island island){
        for (Map.Entry<Coordinate, ArrayList<Resident>> entry : island.getIsland().entrySet()) {
            Coordinate key = entry.getKey();
            ArrayList<Resident> entityList = entry.getValue();
            System.out.println("CoordinateX : " + key.getCoordinateX() +
                    "; CoordinateY : " + key.getCoordinateY() + "; Entity " + entityList.toString());
        }
    }
}