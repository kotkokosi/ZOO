package handlers;

import interfaces.generalEntity.Resident;

import java.util.*;

public class EatHandler {
    public static final List<Resident> animalsToRemove = new ArrayList<>();

    public static List<Resident> animalsDeath(List<Resident> residentList, List<Resident> animalsToRemove) {
        Iterator<Resident> iterator = residentList.iterator();
        while (iterator.hasNext()) {
            Resident resident = iterator.next();
            if (animalsToRemove.contains(resident)) {
                iterator.remove();
                animalsToRemove.remove(resident);
            }
        }
        return residentList;
    }
}

