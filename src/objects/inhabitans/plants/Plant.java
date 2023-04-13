package objects.inhabitans.plants;

import objects.inhabitans.Entity;

public abstract class Plant extends Entity {
    public int getMaxQuantityPerCell() {
        return maxQuantityPerCell;
    }

    public void setMaxQuantityPerCell(int maxQuantityPerCell) {
        this.maxQuantityPerCell = maxQuantityPerCell;
    }

    private int maxQuantityPerCell;
    public Plant(String name, String icon) {
        super(name, icon);
    }
}
