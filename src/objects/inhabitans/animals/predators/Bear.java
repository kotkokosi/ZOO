package objects.inhabitans.animals.predators;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Сell;

import java.util.Map;


public class Bear extends Predator implements Resident {
    @JsonCreator
    public Bear(
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
//        String nameAnimal = food.getClass().getName();
//        if(new Random().nextInt(100) <= EATING_RISK_MAP_BEAR.get(nameAnimal)){
//            System.out.println("");
//        }
    }

    @Override
    public void selectDirection(Сell сell) {

    }
}
