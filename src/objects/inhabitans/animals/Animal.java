package objects.inhabitans.animals;

import objects.inhabitans.Entity;
import objects.island.Coordinate;

public abstract class Animal extends Entity {
    private double weight;
    private int movementSpeed;
    private double foodRequiredForSatiation;
    private double indexSatiety;
    private int maxQuantityPerCell;

    public double getWeight() {
        return weight;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getFoodRequiredForSatiation() {
        return foodRequiredForSatiation;
    }

    public double getIndexSatiety() {
        return indexSatiety;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxQuantityPerCell() {
        return maxQuantityPerCell;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public void setFoodRequiredForSatiation(double foodRequiredForSatiation) {
        this.foodRequiredForSatiation = foodRequiredForSatiation;
    }

    public void setIndexSatiety(double indexSatiety) {
        this.indexSatiety = indexSatiety;
    }

    public void setMaxQuantityPerCell(int maxQuantityPerCell) {
        this.maxQuantityPerCell = maxQuantityPerCell;
    }

    public Animal(String name, String icon, double weight,
                  int movementSpeed, double foodRequiredForSatiation, int maxQuantityPerCell) {
        super(name, icon);
        this.weight = weight;
        this.movementSpeed = movementSpeed;
        this.foodRequiredForSatiation = foodRequiredForSatiation;
        this.indexSatiety = foodRequiredForSatiation / 2;
        this.maxQuantityPerCell = maxQuantityPerCell;
    }

    public abstract void eat(Animal food);

    public abstract void multiply();

    public abstract void selectDirection(Coordinate coordinate);
}
