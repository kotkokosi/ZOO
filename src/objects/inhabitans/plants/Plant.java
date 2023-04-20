package objects.inhabitans.plants;

import lombok.Setter;
import objects.inhabitans.Entity;

@Setter
public abstract class Plant extends Entity {

    private double weight;
    private int maxQuantityPerCell;

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
