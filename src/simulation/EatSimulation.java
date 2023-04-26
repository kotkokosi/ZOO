package simulation;

import interfaces.generalEntity.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.Animal;
import objects.inhabitans.plants.Grass;
import objects.inhabitans.virus.Covid;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class EatSimulation {

    private Set<Integer> animalsToRemove = new HashSet<>();

    public List<Resident> eatIterator(List<Resident> residentList) {
        for (int j = 0; j < residentList.size(); j++) {
            for (int i = 0; i < residentList.size(); i++) {
                if (j == i){continue;}
                    addToRemove(residentList.get(j), residentList.get(i), i);
            }
        }
        return animalsDeath(residentList, animalsToRemove);
    }


    private void addToRemove(Resident eater, Resident food, int i) {
        if (eater instanceof Animal animal && animal.isDeadly(food)) {
            animal.setEnergy(food.getWeight());
            if (food instanceof Grass grass && grass.getWeight() == 5) {
                grass.setGrowGrass(0);
            }
            if(!(food instanceof Grass)){
                this.animalsToRemove.add(i);
            }
        } else if (eater instanceof Covid covid) {
            if (covid.isDeadly(food)) {
                animalsToRemove.add(i);
            }
        }
    }




    private List<Resident> animalsDeath(List<Resident> residentList, Set<Integer> animalsToRemove) {
        Iterator<Resident> iterator = residentList.iterator();
        int currentIndex = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (animalsToRemove.contains(currentIndex)) {
                iterator.remove();
            }
            currentIndex++;
        }
        return residentList;
    }
}