package objects.inhabitans.animals;

import lombok.Setter;
import objects.inhabitans.Entity;
import objects.island.Coordinate;
import objects.island.Сell;

import java.util.Map;
import java.util.Random;


@Setter
public abstract class Animal extends Entity {

    private double weight;
    private int maxQuantityPerCell;
    private int movementSpeed;
    private double foodRequiredForSatiation;

    private double energy;

    private Map<String, Integer> eatingRiskMap;

    public double getWeight() {
        return weight;
    }

    public int getMaxQuantityPerCell() {
        return maxQuantityPerCell;
    }
    public int getMovementSpeed() {
        return movementSpeed;
    }
    public double getFoodRequiredForSatiation() {
        return foodRequiredForSatiation;
    }
    public double getEnergy() {
        return energy;
    }
    public Map<String, Integer> getEatingRiskMap() {
        return eatingRiskMap;
    }

    public Animal(String name, String icon, double weight,
                  int maxQuantityPerCell, int movementSpeed, double foodRequiredForSatiation, double energy, Map<String, Integer> eatingRiskMap) {
        super(name, icon);
        this.weight = weight;
        this.maxQuantityPerCell = maxQuantityPerCell;
        this.movementSpeed = movementSpeed;
        this.foodRequiredForSatiation = foodRequiredForSatiation;
        this.energy = energy;
        this.eatingRiskMap = eatingRiskMap;
    }

    public Coordinate selectDirection(){
        int supposedMoveX = new Random().nextInt(this.movementSpeed + 1);
        int supposedMoveY = new Random().nextInt(this.movementSpeed + 1);
        return new Coordinate(supposedMoveX, supposedMoveY);
    }
}
