package objects.inhabitans.virus;

import lombok.Setter;
import objects.inhabitans.Entity;
import java.util.Map;

@Setter
public abstract class Virus extends Entity {
    private Map<String, Integer> eatingRiskMap;

    public Map<String, Integer> getEatingRiskMap() {
        return eatingRiskMap;
    }

    public Virus(String name, String icon, Map<String, Integer> eatingRiskMap) {
        super(name, icon);
        this.eatingRiskMap = eatingRiskMap;
    }
}
