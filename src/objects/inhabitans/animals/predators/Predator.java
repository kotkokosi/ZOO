package objects.inhabitans.animals.predators;

import objects.inhabitans.animals.Animal;

import java.util.Map;

public abstract class Predator extends Animal {
    public Predator(String name, String icon, double weight, int maxQuantityPerCell, int movementSpeed, double foodRequiredForSatiation, Map<String, Integer> eatingRiskMap) {
        super(name, icon, weight, maxQuantityPerCell, movementSpeed, foodRequiredForSatiation, eatingRiskMap);
    }
}
