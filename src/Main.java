import interfaces.generalEntity.Resident;
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
        Simulation simulation = new Simulation();
        simulation.mainSimulation(2, island);
    }
}