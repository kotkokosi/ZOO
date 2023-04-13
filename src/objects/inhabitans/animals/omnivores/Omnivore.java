package objects.inhabitans.animals.omnivores;

import objects.inhabitans.animals.Animal;

public abstract class Omnivore extends Animal {
    public Omnivore(String name, String icon, double weight, int radiusMove, double amountForSatiety, int maxQuantityPerCell) {
        super(name, icon, weight, radiusMove, amountForSatiety, maxQuantityPerCell);
    }
}
