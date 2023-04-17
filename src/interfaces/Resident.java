package interfaces;

import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.Boar;
import objects.inhabitans.animals.omnivores.Duck;
import objects.inhabitans.animals.omnivores.Mouse;
import objects.inhabitans.animals.predators.*;
import objects.inhabitans.plants.Grass;
import objects.inhabitans.virus.Virus;

import java.util.Map;

public interface Resident {
    public String getName();
    public String getIcon();
    public double getWeight();
    public int getMaxQuantityPerCell();
    public int getMovementSpeed();
    public double getFoodRequiredForSatiation();
    public Map<String, Integer> getEatingRiskMap();
}
