package objects.inhabitans.virus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.generalEntity.Resident;
import java.util.Map;

public class Covid extends Virus implements Resident {
    @JsonCreator
    public Covid(@JsonProperty("name") String name,
                 @JsonProperty("icon") String icon,
                 @JsonProperty("eatingRiskMap") Map<String, Integer> eatingRiskMap) {
        super(name, icon, eatingRiskMap);
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public int getMaxQuantityPerCell() {
        return 0;
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
    public double getEnergy() {
        return 0;
    }
}
