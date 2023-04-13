package objects.island;

import generator.GeneratorEntity;
import interfaces.Resident;

import java.util.ArrayList;
import java.util.HashMap;

public record Island(int islandHeight, int islandWeight) {
    private static final HashMap<Coordinate, ArrayList<Resident>> island = new HashMap<>();

    public HashMap<Coordinate, ArrayList<Resident>> getIsland() {
        return island;
    }
    public void islandFill() {
        for (int i = 1; i <= islandHeight; i++) {
            for (int j = 1; j <= islandWeight; j++) {
                island.put(new Coordinate(i, j), (ArrayList<Resident>) new GeneratorEntity().generateListEntity());
            }
        }
    }

//    private List<Resident> generateListEntity() {
//        return Stream.generate(this::generateEntity)
//                .limit(new Random().nextInt(1, 5))
//                .collect(Collectors.toCollection(ArrayList::new));
//    }
//
//    private Resident generateEntity() {
//        Resident[] entities = {new Boar(), new Buffalo(), new Caterpillar(), new Deer(), new Duck(),
//                new Goat(), new Horse(), new Mouse(), new Rabbit(), new Sheep(),
//                new Grass(), new Bear(), new Boa(), new Eagle(), new Fox(), new Wolf()};
//        return entities[new Random().nextInt(entities.length)];
//    }
}
