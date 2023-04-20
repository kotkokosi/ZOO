package objects.inhabitans.animals.omnivores;


import objects.inhabitans.animals.Animal;

import java.util.Map;

public abstract class Omnivore extends Animal {
    public Omnivore(String name, String icon, double weight, int maxQuantityPerCell, int movementSpeed, double foodRequiredForSatiation, double energy, Map<String, Integer> eatingRiskMap) {
        super(name, icon, weight, maxQuantityPerCell, movementSpeed, foodRequiredForSatiation, energy, eatingRiskMap);
    }
}