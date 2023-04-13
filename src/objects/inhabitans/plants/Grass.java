package objects.inhabitans.plants;

import interfaces.Resident;

public class Grass extends Plant implements Resident {
    private int maxQuantityPerCell;
    public Grass(String name, String icon) {
        super(name, icon);
    }
}