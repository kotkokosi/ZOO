package interfaces.generalEntity;

import objects.island.Island;
import objects.island.Сell;

import java.util.Map;

public interface Resident {
     String getName();
     String getIcon();
     double getWeight();
     int getMaxQuantityPerCell();
     int getMovementSpeed();
     double getFoodRequiredForSatiation();
     double getEnergy();
     Map<String, Integer> getEatingRiskMap();
     void move(Island island, Сell currentCell);
     void eat(Resident food);
     boolean multiply(Resident father);

}
