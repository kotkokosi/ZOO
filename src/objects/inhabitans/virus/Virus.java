package objects.inhabitans.virus;

import interfaces.generalEntity.Resident;
import lombok.Setter;
import objects.inhabitans.Entity;

import java.util.Map;
import java.util.Random;

@Setter
public abstract class Virus extends Entity {

    private int maxQuantityPerCell;
    private Map<String, Integer> eatingRiskMap;

    public Map<String, Integer> getEatingRiskMap() {
        return eatingRiskMap;
    }

    public int getMaxQuantityPerCell() {
        return maxQuantityPerCell;
    }

    public Virus(String name, String icon, int maxQuantityPerCell, Map<String, Integer> eatingRiskMap) {
        super(name, icon);
        this.maxQuantityPerCell = maxQuantityPerCell;
        this.eatingRiskMap = eatingRiskMap;
    }

    public boolean isDeadly(Resident food){
        int chanceOfDeath = this.getEatingRiskMap().get(food.getName());
        return new Random().nextInt(1, 101) <= chanceOfDeath;
    }
}
