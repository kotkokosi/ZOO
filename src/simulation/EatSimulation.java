package simulation;

import interfaces.generalEntity.Resident;
import objects.inhabitans.animals.Animal;
import objects.inhabitans.plants.Plant;
import objects.inhabitans.virus.Covid;
import objects.island.Сell;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EatSimulation {
    public static void eatAnimal(Сell currentCell, int animalNumber) {
                currentCell.setResidentList(animalsSorting(currentCell.getResidentList(), animalNumber));
    }

    public static List<Resident> animalsSorting(List<Resident> residentList, int animalNumber) {
        Set<Integer> animalsToRemove = new HashSet<>();
        for (int i = 0; i < residentList.size(); i++) {
                if (residentList.get(animalNumber) instanceof Plant) {
                    continue;
                }
                if (residentList.get(animalNumber) instanceof Animal animal) {
                    if (animal.isDeadly(residentList.get(i))) {
                        animal.setEnergy(residentList.get(i).getEnergy());
                        animalsToRemove.add(i);
                    }
                } else {
                    Covid covid = (Covid) residentList.get(animalNumber);
                    if (covid.isDeadly(residentList.get(i))) {
                        animalsToRemove.add(i);
                    }
                }
            }

        return animalsDeath(animalsToRemove, residentList);
    }


    public static List<Resident> animalsDeath(Set<Integer> animalsToRemove, List<Resident> residentList) {
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
