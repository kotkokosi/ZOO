package objects.inhabitans.animals.predators;

import interfaces.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Coordinate;

public class Eagle extends Predator implements Resident {

    public Eagle(String name, String icon, double weight, int movementSpeed, double foodRequiredForSatiation, int maxQuantityPerCell) {
        super(name, icon, weight, movementSpeed, foodRequiredForSatiation, maxQuantityPerCell);
    }

    @Override
    public void eat(Animal meal) {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void selectDirection(Coordinate coordinate) {

    }
}
