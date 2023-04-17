package objects.inhabitans.animals.herbivores;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Сell;

import java.util.Map;

public class Goat extends Herbivore implements Resident {


    @JsonCreator
    public Goat(
            @JsonProperty("name") String name,
            @JsonProperty("icon") String icon,
            @JsonProperty("weight") double weight,
            @JsonProperty("maxQuantityPerCell") int maxQuantityPerCell,
            @JsonProperty("movementSpeed") int movementSpeed,
            @JsonProperty("foodRequiredForSatiation") double foodRequiredForSatiation,
            @JsonProperty("eatingRiskMap") Map<String, Integer> eatingRiskMap) {
        super(name, icon, weight, maxQuantityPerCell, movementSpeed, foodRequiredForSatiation, eatingRiskMap);
    }

    @Override
    public void eat(Animal food) {

    }

    @Override
    public void selectDirection(Сell сell) {

    }
}
