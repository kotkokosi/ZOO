package objects.inhabitans.plants;

import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.generalEntity.Resident;
import lombok.Getter;

import java.util.Map;


public class Grass extends Plant implements Resident {

    private int growGrass = 0;

    public Grass(@JsonProperty("name") String name,
                 @JsonProperty("icon") String icon,
                 @JsonProperty("weight") double weight,
                 @JsonProperty("maxQuantityPerCell") int maxQuantityPerCell){

        super(name, icon, weight, maxQuantityPerCell);
    }

    public void setGrowGrass(int growGrass) {
        this.growGrass = growGrass;
    }

    public void setPlusGrowGrass(int growGrass) {
        if(growGrass == 4) {
            setGrowGrass(getGrowGrass() + growGrass);
            setWeight(1.0);
        } else if (getGrowGrass() < 4) {
            setGrowGrass(getGrowGrass() + growGrass);
        }
    }

    public int getGrowGrass() {
        return growGrass;
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

    @Override
    public Map<String, Integer> getEatingRiskMap() {
        return null;
    }
}