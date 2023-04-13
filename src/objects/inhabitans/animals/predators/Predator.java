package objects.inhabitans.animals.predators;

import objects.inhabitans.animals.Animal;

public abstract class Predator extends Animal {
    public Predator(String name, String icon, double weight, int movementSpeed, double foodRequiredForSatiation, int maxQuantityPerCell) {
        super(name, icon, weight, movementSpeed, foodRequiredForSatiation, maxQuantityPerCell);
    }
}
