package objects.inhabitans.animals.omnivores;

import interfaces.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Coordinate;

public class Boar extends Omnivore implements Resident {

    public Boar(String name, String icon, double weight, int radiusMove, double amountForSatiety, int maxQuantityPerCell) {
        super(name, icon, weight, radiusMove, amountForSatiety, maxQuantityPerCell);
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
