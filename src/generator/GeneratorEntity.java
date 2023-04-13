package generator;

import interfaces.Resident;
import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.*;
import objects.inhabitans.animals.predators.*;
import objects.inhabitans.plants.*;
import objects.inhabitans.virus.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratorEntity {

    public List<Resident> generateListEntity() {
        return Stream.generate(this::generateEntity)
                .limit(new Random().nextInt(1, 5))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private Resident generateEntity() {
        ArrayList<Resident> entities = new ArrayList<>();

        entities.add(0, new Boar());
        entities.add(1, new Buffalo());
        entities.add(2, new Caterpillar());
        entities.add(3, new Duck());
        entities.add(4, new Goat());
        entities.add(5, new Horse());
        entities.add(6, new Mouse());
        entities.add(7, new Rabbit());
        entities.add(8, new Sheep());
        entities.add(9, new Grass());
        entities.add(10, new Bear());
        entities.add(11, new Boa());
        entities.add(12, new Eagle());
        entities.add(13, new Fox());
        entities.add(14, new Deer());
        entities.add(15, new Wolf());

        if(new Random().nextInt(100) < 11){
            entities.add(16,new Covid("COVID-19", "\uD83E\uDDA0"));
        }

        return entities.get(new Random().nextInt(entities.size()));
    }
}
