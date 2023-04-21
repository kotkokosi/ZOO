package objects.inhabitans.virus;

import interfaces.generalEntity.Resident;
import lombok.Setter;
import objects.inhabitans.Entity;

import java.util.Map;
import java.util.Random;

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

    public boolean isDeadly(Resident food){
        int chanceOfDeath = this.getEatingRiskMap().get(food.getName());
        return new Random().nextInt(1, 101) <= chanceOfDeath;
    }
}
