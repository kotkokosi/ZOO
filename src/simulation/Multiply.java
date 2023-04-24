package simulation;

import interfaces.generalEntity.Resident;
import objects.inhabitans.animals.Animal;
import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.Boar;
import objects.inhabitans.animals.omnivores.Duck;
import objects.inhabitans.animals.omnivores.Mouse;
import objects.inhabitans.animals.predators.*;
import objects.inhabitans.plants.Grass;
import objects.inhabitans.virus.Virus;
import objects.island.Сell;

import java.util.ArrayList;
import java.util.List;


public class Multiply {
    public static void multiplyAnimal(Сell currentCell, int animalNumber) {
        Animal animal = animalBirth(currentCell.getResidentList(), animalNumber);
        if(animal != null){
            currentCell.addResidentToList((Resident) animal);
        }
    }

    public static Animal animalBirth(List<Resident> residentList, int animalNumber) {
        for (int i = 0; i < residentList.size(); i++) {
            if(i == animalNumber){
                continue;
            }

            if (residentList.get(animalNumber) instanceof Animal animal) {
            //Class<?> clazz =
                if (animal.isPair((Animal) residentList.get(i)) {
                    return false;
                }
            }
        }
    }
}
