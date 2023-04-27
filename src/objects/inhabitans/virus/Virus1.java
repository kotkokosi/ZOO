package objects.inhabitans.virus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.generalEntity.Resident;
import java.util.Map;

public class Virus1 extends Virus implements Resident {
    @JsonCreator
    public Virus1(@JsonProperty("name") String name,
                  @JsonProperty("icon") String icon,
                  @JsonProperty("maxQuantityPerCell") int maxQuantityPerCell,
                  @JsonProperty("eatingRiskMap") Map<String, Integer> eatingRiskMap) {
        super(name, icon, maxQuantityPerCell, eatingRiskMap);
    }

    @Override
    public double getWeight() {
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
