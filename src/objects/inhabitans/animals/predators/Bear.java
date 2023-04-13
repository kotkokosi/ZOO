package objects.inhabitans.animals.predators;

import interfaces.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Coordinate;

import java.util.Random;

import static constans.Garbadge.EatingRiskMapCollection.EATING_RISK_MAP_BEAR;

public class Bear extends Predator implements Resident {

    public Bear(String name, String icon, double weight, int movementSpeed, double foodRequiredForSatiation, int maxQuantityPerCell) {
        super(name, icon, weight, movementSpeed, foodRequiredForSatiation, maxQuantityPerCell);
    }

    @Override
    public void eat(Animal food) {
        String nameAnimal = food.getClass().getName();
        if(new Random().nextInt(100) <= EATING_RISK_MAP_BEAR.get(nameAnimal)){
            System.out.println("");
        }
    }

    @Override
    public void multiply() {

    }

    @Override
    public void selectDirection(Coordinate coordinate) {

    }
}
