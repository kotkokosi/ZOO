package generator;

import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.MaxQuantityPerCell;
import interfaces.generalEntity.Resident;
import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.Boar;
import objects.inhabitans.animals.omnivores.Duck;
import objects.inhabitans.animals.omnivores.Mouse;
import objects.inhabitans.animals.predators.*;
import objects.inhabitans.plants.Grass;
import objects.inhabitans.virus.Covid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static constants.path.JsonPath.*;

public class GeneratorListEntity {
    public List<Resident> generateListEntity(CheckMaxQuantityPerCell check) {
        List<Resident> residents = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(1, 40); i++) {// bound do limit Entity on Cell
            boolean turn = true;
            while (turn) {
                Resident resident = new GeneratorListEntity().generateEntity();
                if (!(check.checkPlusQuantityPerCellGeneration(resident))) {
                    residents.add(resident);
                    turn = false;
                }
            }
        }
        //check.cleanFields();
        return residents;
    }


    private Resident generateEntity() {
        ArrayList<Resident> entities = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            entities.add(0, objectMapper.readValue(pathBoar, Boar.class));
            entities.add(1, objectMapper.readValue(pathBuffalo, Buffalo.class));
            entities.add(2, objectMapper.readValue(pathCaterpillar, Caterpillar.class));
            entities.add(3, objectMapper.readValue(pathDuck, Duck.class));
            entities.add(4, objectMapper.readValue(pathGoat, Goat.class));
            entities.add(5, objectMapper.readValue(pathHorse, Horse.class));
            entities.add(6, objectMapper.readValue(pathMouse, Mouse.class));
            entities.add(7, objectMapper.readValue(pathRabbit, Rabbit.class));
            entities.add(8, objectMapper.readValue(pathSheep, Sheep.class));
            entities.add(9, objectMapper.readValue(pathGrass, Grass.class));
            entities.add(10, objectMapper.readValue(pathBear, Bear.class));
            entities.add(11, objectMapper.readValue(pathBoa, Boa.class));
            entities.add(12, objectMapper.readValue(pathEagle, Eagle.class));
            entities.add(13, objectMapper.readValue(pathFox, Fox.class));
            entities.add(14, objectMapper.readValue(pathDeer, Deer.class));
            entities.add(15, objectMapper.readValue(pathWolf, Wolf.class));

            if (new Random().nextInt(100) < 11) {
                entities.add(16, objectMapper.readValue(pathCovid, Covid.class));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return entities.get(new Random().nextInt(entities.size()));
    }
}
