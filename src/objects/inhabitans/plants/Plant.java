package objects.inhabitans.plants;

import objects.inhabitans.Entity;

public abstract class Plant extends Entity {

    private double weight;

    private int maxQuantityPerCell;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaxQuantityPerCell(int maxQuantityPerCell) {
        this.maxQuantityPerCell = maxQuantityPerCell;
    }

    public double getWeight() {
        return weight;
    }
    public int getMaxQuantityPerCell() {
        return maxQuantityPerCell;
    }
    public Plant(String name, String icon, double weight, int maxQuantityPerCell) {
        super(name, icon);
        this.weight = weight;
        this.maxQuantityPerCell = maxQuantityPerCell;
    }
}
