package objects.inhabitans.animals.herbivores;


import objects.inhabitans.animals.Animal;

import java.util.Map;


public abstract class Herbivore extends Animal {
    public Herbivore(String name, String icon, double weight, int maxQuantityPerCell, int movementSpeed, double foodRequiredForSatiation, Map<String, Integer> eatingRiskMap) {
        super(name, icon, weight, maxQuantityPerCell, movementSpeed, foodRequiredForSatiation, eatingRiskMap);
    }
}
