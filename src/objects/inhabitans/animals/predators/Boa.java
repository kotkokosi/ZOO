package objects.inhabitans.animals.predators;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.generalEntity.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.Animal;
import objects.island.Сell;

import java.util.Map;

@Getter
@Setter
public class Boa extends Predator implements Resident {

    @JsonCreator
    public Boa(
            @JsonProperty("name") String name,
            @JsonProperty("icon") String icon,
            @JsonProperty("weight") double weight,
            @JsonProperty("maxQuantityPerCell") int maxQuantityPerCell,
            @JsonProperty("movementSpeed") int movementSpeed,
            @JsonProperty("foodRequiredForSatiation") double foodRequiredForSatiation,
            @JsonProperty("energy") double energy,
            @JsonProperty("eatingRiskMap") Map<String, Integer> eatingRiskMap) {
        super(name, icon, weight, maxQuantityPerCell, movementSpeed, foodRequiredForSatiation, energy, eatingRiskMap);
    }

    @Override
    public void eat(Animal meal) {

    }

    @Override
    public void multiply(Сell сell) {

    }
}
