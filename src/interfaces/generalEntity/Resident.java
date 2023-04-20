package interfaces.generalEntity;

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
}
