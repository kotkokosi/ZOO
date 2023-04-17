package objects.inhabitans.animals;

import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.Entity;
import objects.island.Coordinate;
import objects.island.Island;
import objects.island.Сell;

import java.util.Map;
import java.util.Random;

@Getter
@Setter
public abstract class Animal extends Entity {

    private double weight;
    private int maxQuantityPerCell;
    private int movementSpeed;
    private double foodRequiredForSatiation;
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
    public Map<String, Integer> getEatingRiskMap() {
        return eatingRiskMap;
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

    public Coordinate multiply(){
        int supposedMoveX = new Random().nextInt(this.movementSpeed + 1);
        int supposedMoveY = new Random().nextInt(this.movementSpeed + 1);
        return new Coordinate(supposedMoveX, supposedMoveY);
    }

    public abstract void selectDirection(Сell сell);
}
