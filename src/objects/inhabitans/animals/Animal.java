package objects.inhabitans.animals;

import generator.RandomRangeInt;
import interfaces.generalEntity.Resident;
import lombok.Setter;
import objects.inhabitans.Entity;
import objects.inhabitans.animals.predators.Bear;
import objects.inhabitans.animals.predators.Predator;
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
        if(animal.getName().equals(this.getName())){
            int love = RandomRangeInt.getNumber(0, 101);
            return love < 95;
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
        return RandomRangeInt.getNumber(1,101) <= chanceOfDeath;
    }

    public boolean minusEnergyAndCheckDead() {
        if (this.getEnergy() <= this.getFoodRequiredForSatiation() / 100) {
            return true;
        } else {
            energy = this.getEnergy() - (this.getFoodRequiredForSatiation() / 100);
            return false;
        }
    }
}
