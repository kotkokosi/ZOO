import interfaces.Resident;
import objects.island.Island;
import objects.island.Сell;
import simulation.Simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int islandHeight;
        int islandWeight;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("ENTER ISLAND HEIGHT - ");
            islandHeight = scanner.nextInt();
            System.out.print("ENTER ISLAND WEIGHT - ");
            islandWeight = scanner.nextInt();
        }
        Island island = new Island(islandHeight, islandWeight);
        island.islandFill();
        printIsland(island);
        Simulation simulation = new Simulation();
        simulation.moveEntity(island);
        simulation.moveEntity(island);
        printIsland(island);
    }

    public static void print1Island(Island island) {
        for (Сell[] cells : island.getСells()) {
            for (Сell cell : cells) {
            }
        }
    }

    public static void printIsland(Island island) {
        for (Сell[] cells : island.getСells()) {
            for (Сell cell : cells) {
                for(Resident resident : cell.getResidentList()){
                System.out.print(resident.getName() + " ");
                System.out.print(resident.getIcon() + " ");
                System.out.print(resident.getWeight() + " ");
                System.out.print(resident.getMaxQuantityPerCell() + " ");
                System.out.print(resident.getMovementSpeed() + " ");
                System.out.print(resident.getFoodRequiredForSatiation() + " ");
                System.out.print(resident.getMovementSpeed() + " ");
                System.out.println(resident.getEatingRiskMap() + " ");
            }
        }
    }
}
}