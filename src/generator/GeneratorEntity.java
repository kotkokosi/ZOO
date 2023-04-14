package generator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import interfaces.Resident;
import objects.inhabitans.Entity;
import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.*;
import objects.inhabitans.animals.predators.*;
import objects.inhabitans.plants.*;
import objects.inhabitans.virus.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static constans.path.YamlPath.*;

public class GeneratorEntity {

    public List<Resident> generateListEntity() {
        return Stream.generate(this::generateEntity)
                .limit(new Random().nextInt(1, 5))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private Resident generateEntity() {
        ArrayList<Resident> entities = new ArrayList<>();

        entities.add(0, birthResident(pathBoar, Boar.class));
        entities.add(1, birthResident(pathBuffalo, Buffalo.class));
        entities.add(2, birthResident(pathCaterpillar, Caterpillar.class));
        entities.add(3, birthResident(pathDuck, Duck.class));
        entities.add(4, birthResident(pathGoat, Goat.class));
        entities.add(5, birthResident(pathHorse, Horse.class));
        entities.add(6, birthResident(pathMouse, Mouse.class));
        entities.add(7, birthResident(pathRabbit, Rabbit.class));
        entities.add(8, birthResident(pathSheep, Sheep.class));
        entities.add(9, birthResident(pathGrass, Grass.class));
        entities.add(10, birthResident(pathBear, Bear.class));
        entities.add(11, birthResident(pathBoa, Boa.class));
        entities.add(12, birthResident(pathEagle, Eagle.class));
        entities.add(13, birthResident(pathFox, Fox.class));
        entities.add(14, birthResident(pathDeer, Deer.class));
        entities.add(15, birthResident(pathWolf,Wolf.class));

        if(new Random().nextInt(100) < 11){
            entities.add(16, birthResident(pathCovid, Covid.class));
        }

        return entities.get(new Random().nextInt(entities.size()));
    }

    private Resident birthResident(String path, Class<? extends Entity> clazz){
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        return (Resident) objectMapper.convertValue(new File(path), clazz);
    }
}
