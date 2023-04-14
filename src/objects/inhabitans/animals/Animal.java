package objects.inhabitans.animals;

import objects.inhabitans.Entity;
import objects.island.Coordinate;

import java.util.Map;

public abstract class Animal extends Entity {
    private double weight;
    private int maxQuantityPerCell;
    private int movementSpeed;
    private double foodRequiredForSatiation;
    Map<String, Integer> eatingRiskMap;

    public Map<String, Integer> getEatingRiskMap() {
        return eatingRiskMap;
    }

    public double getWeight() {
        return weight;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getFoodRequiredForSatiation() {
        return foodRequiredForSatiation;
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

    public void setMaxQuantityPerCell(int maxQuantityPerCell) {
        this.maxQuantityPerCell = maxQuantityPerCell;
    }

    public void setEatingRiskMap(Map<String, Integer> eatingRiskMap) {
        this.eatingRiskMap = eatingRiskMap;
    }

    public Animal(String name, String icon, double weight,
                  int maxQuantityPerCell, int movementSpeed, double foodRequiredForSatiation, Map<String, Integer> eatingRiskMap) {
        super(name, icon);
        this.weight = weight;
        this.maxQuantityPerCell = maxQuantityPerCell;
        this.movementSpeed = movementSpeed;
        this.foodRequiredForSatiation = foodRequiredForSatiation;
        this.eatingRiskMap = eatingRiskMap;
    }

    public abstract void eat(Animal food);

    public abstract void multiply();

    public abstract void selectDirection(Coordinate coordinate);
}
