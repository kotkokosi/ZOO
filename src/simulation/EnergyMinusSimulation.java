package simulation;

import interfaces.generalEntity.Resident;
import objects.inhabitans.animals.Animal;
import objects.island.Island;
import objects.island.Сell;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class EnergyMinusSimulation {
    public static void energyMinus(Island island) {
        for (Сell[] cells : island.getСells()) {
            for (Сell currentCell : cells) {
                currentCell.setResidentList(animalsSorting(currentCell.getResidentList()));
            }
        }
    }

    public static List<Resident> animalsSorting(List<Resident> residentList) {
        Set<Integer> animalsToRemove = new HashSet<>();
        for (int i = 0; i < residentList.size(); i++) {
            if(residentList.get(i) instanceof Animal animal)
                if (animal.minusEnergyAndCheckDead()) {
                    animalsToRemove.add(i);
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
