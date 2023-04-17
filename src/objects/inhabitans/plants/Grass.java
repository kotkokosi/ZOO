package objects.inhabitans.plants;

import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.Resident;

import java.util.Map;

public class Grass extends Plant implements Resident {

    public Grass(@JsonProperty("name") String name,
                 @JsonProperty("icon") String icon,
                 @JsonProperty("weight") double weight,
                 @JsonProperty("maxQuantityPerCell") int maxQuantityPerCell){

        super(name, icon, weight, maxQuantityPerCell);
    }

    @Override
    public int getMovementSpeed() {
        return 0;
    }

    @Override
    public double getFoodRequiredForSatiation() {
        return 0;
    }

    @Override
    public Map<String, Integer> getEatingRiskMap() {
        return null;
    }
}