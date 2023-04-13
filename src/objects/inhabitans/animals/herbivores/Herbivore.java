package objects.inhabitans.animals.herbivores;

import objects.inhabitans.animals.Animal;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, String icon, double weight, int movementSpeed, double foodRequiredForSatiation, int maxQuantityPerCell) {
        super(name, icon, weight, movementSpeed, foodRequiredForSatiation, maxQuantityPerCell);
    }
}
