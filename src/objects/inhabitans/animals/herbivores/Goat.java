package objects.inhabitans.animals.herbivores;

import interfaces.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Coordinate;

import java.util.Map;

public class Goat extends Herbivore implements Resident {


    public Goat(String name, String icon, double weight, int maxQuantityPerCell, int movementSpeed, double foodRequiredForSatiation, Map<String, Integer> eatingRiskMap) {
        super(name, icon, weight, maxQuantityPerCell, movementSpeed, foodRequiredForSatiation, eatingRiskMap);
    }

    @Override
    public void eat(Animal food) {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void selectDirection(Coordinate coordinate) {

    }
}
