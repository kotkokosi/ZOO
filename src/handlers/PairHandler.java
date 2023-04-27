package handlers;

import com.fasterxml.jackson.databind.ObjectMapper;
import interfaces.generalEntity.Resident;
import objects.inhabitans.animals.Animal;
import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.Boar;
import objects.inhabitans.animals.omnivores.Duck;
import objects.inhabitans.animals.omnivores.Mouse;
import objects.inhabitans.animals.predators.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static constants.path.JsonPath.*;
public class PairHandler {
public static final List<Resident> children = new ArrayList<>();

    public static Animal animalBirth(Resident residentFather, Resident residentMother) {
        if (residentFather instanceof Animal animal && residentMother instanceof Animal animal1 && animal1.isPair(animal)) {
            return inputResidentOutAnimal(residentFather);
        }
        return null;
    }

    private static Animal inputResidentOutAnimal(Resident resident) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            if (resident instanceof Buffalo) {
                return objectMapper.readValue(pathBuffalo, Buffalo.class);
            } else if (resident instanceof Caterpillar) {
                return objectMapper.readValue(pathCaterpillar, Caterpillar.class);
            } else if (resident instanceof Deer) {
                return objectMapper.readValue(pathDeer, Caterpillar.class);
            } else if (resident instanceof Goat) {
                return objectMapper.readValue(pathGoat, Goat.class);
            } else if (resident instanceof Horse) {
                return objectMapper.readValue(pathHorse, Horse.class);
            } else if (resident instanceof Rabbit) {
                return objectMapper.readValue(pathRabbit, Rabbit.class);
            } else if (resident instanceof Sheep) {
                return objectMapper.readValue(pathSheep, Sheep.class);
            } else if (resident instanceof Boar) {
                return objectMapper.readValue(pathBoar, Boar.class);
            } else if (resident instanceof Duck) {
                return objectMapper.readValue(pathDuck, Duck.class);
            } else if (resident instanceof Mouse) {
                return objectMapper.readValue(pathMouse, Mouse.class);
            } else if (resident instanceof Bear) {
                return objectMapper.readValue(pathBear, Bear.class);
            } else if (resident instanceof Boa) {
                return objectMapper.readValue(pathBoa, Boa.class);
            } else if (resident instanceof Eagle) {
                return objectMapper.readValue(pathEagle, Eagle.class);
            } else if (resident instanceof Fox) {
                return objectMapper.readValue(pathFox, Fox.class);
            } else if (resident instanceof Wolf) {
                return objectMapper.readValue(pathWolf, Wolf.class);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
