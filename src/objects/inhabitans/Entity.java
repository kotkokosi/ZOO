package objects.inhabitans;

import handlers.EatHandler;
import handlers.MoveHandler;
import interfaces.generalEntity.Resident;
import lombok.Setter;
import objects.inhabitans.animals.Animal;
import objects.inhabitans.virus.Virus1;
import objects.island.Island;
import objects.island.Сell;

import static handlers.PairHandler.animalBirth;
import static handlers.PairHandler.children;

@Setter
public abstract class Entity {
    private String name;
    private String icon;

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public Entity(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }

    public void move(Island island, Сell currentCell) {
        currentCell.getCheckMaxQuantityPerCell().checkMinusQuantityPerCell((Resident) this);
        if (this instanceof Animal animal) {
            new MoveHandler().moveAllowed(island, currentCell, animal);
        } else {
            new MoveHandler().moveNotAllowed(island, currentCell, (Resident) this);
        }
    }
    public void eat(Resident food) {
        if (this instanceof Animal animal && animal.isDeadly(food)) {
            animal.setEnergy(food.getWeight());
            EatHandler.animalsToRemove.add(food);
        } else if (this instanceof Virus1 virus1) {
            if (virus1.isDeadly(food)) {
                EatHandler.animalsToRemove.add(food);
            }
        }
    } public boolean multiply(Resident father) {
        Animal animal = animalBirth((Resident) this, father);
        if (animal != null) {
            children.add((Resident) animal);
            return true;
        }else{
            return false;
        }
    }
}
