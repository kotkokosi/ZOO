package objects.inhabitans.animals.herbivores;

import interfaces.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Coordinate;

public class Rabbit extends Herbivore implements Resident {

    public Rabbit(String name, String icon, double weight, int movementSpeed, double foodRequiredForSatiation, int maxQuantityPerCell) {
        super(name, icon, weight, movementSpeed, foodRequiredForSatiation, maxQuantityPerCell);
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
