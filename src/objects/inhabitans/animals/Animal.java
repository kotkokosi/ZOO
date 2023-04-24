package objects.inhabitans.animals;

import interfaces.generalEntity.Resident;
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

    public void setEnergy(double energy) {
        if (energy > foodRequiredForSatiation - this.energy) {
            this.energy = foodRequiredForSatiation;
        } else {
            this.energy += energy;
        }

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


    public boolean isPair(Animal animal) {
        if(this instanceof Animal){
            int love = new Random().nextInt(20);
            return love < 20;
        }
        return false;
    }

    public Coordinate selectDirection(Сell currentCell) {
        Random random = new Random();
        int randomX = random.nextInt((this.movementSpeed * -1), this.movementSpeed + 1);
        int randomY = random.nextInt((this.movementSpeed * -1), this.movementSpeed + 1);

        int supposedMoveX = (randomX) + currentCell.getCoordinate().getCoordinateX();
        int supposedMoveY = (randomY) + currentCell.getCoordinate().getCoordinateY();

        return new Coordinate(supposedMoveX, supposedMoveY);
    }

    public boolean isDeadly(Resident food) {
        int chanceOfDeath = this.getEatingRiskMap().get(food.getName());
        return new Random().nextInt(1, 101) <= chanceOfDeath;
    }

    public boolean minusEnergyAndCheckDead() {
        if (this.getEnergy() <= 10) {
            return true;
        } else {
            this.setEnergy(this.getEnergy() - 10);
            return false;
        }
    }
}
