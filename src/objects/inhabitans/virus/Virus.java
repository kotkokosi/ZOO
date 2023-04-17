package objects.inhabitans.virus;

import objects.inhabitans.Entity;
import java.util.Map;

public abstract class Virus extends Entity {
    protected Map<String, Integer> eatingRiskMap;

    public Map<String, Integer> getEatingRiskMap() {
        return eatingRiskMap;
    }

    public Virus(String name, String icon, Map<String, Integer> eatingRiskMap) {
        super(name, icon);
        this.eatingRiskMap = eatingRiskMap;
    }
}
