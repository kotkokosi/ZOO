package generator;


import exceptions.MaxQuantityPerCell;
import interfaces.generalEntity.Resident;
import lombok.Getter;
import lombok.Setter;
import objects.inhabitans.animals.herbivores.*;
import objects.inhabitans.animals.omnivores.Boar;
import objects.inhabitans.animals.omnivores.Duck;
import objects.inhabitans.animals.omnivores.Mouse;
import objects.inhabitans.animals.predators.*;
import objects.inhabitans.plants.Grass;
import objects.inhabitans.virus.Covid;
import objects.inhabitans.virus.Virus;

@Getter
@Setter
public class CheckMaxQuantityPerCell {

    private int buffaloQuantityPerCell = 0;
    private int caterpillarQuantityPerCell = 0;
    private int deerQuantityPerCell = 0;
    private int goatQuantityPerCell = 0;
    private int horseQuantityPerCell = 0;
    private int rabbitQuantityPerCell = 0;
    private int sheepQuantityPerCell = 0;
    private int boarQuantityPerCell = 0;
    private int duckQuantityPerCell = 0;
    private int mouseQuantityPerCell = 0;
    private int bearQuantityPerCell = 0;
    private int boaQuantityPerCell = 0;
    private int eagleQuantityPerCell = 0;
    private int foxQuantityPerCell = 0;
    private int grassQuantityPerCell = 0;
    private int covidQuantityPerCell = 0;
    private int wolfQuantityPerCell = 0;


    public boolean checkPlusQuantityPerCellGeneration(Resident resident) {

        if (getTotalQuantityPerCell() >= 2406) {
            throw new MaxQuantityPerCell("Max quantity per cell!!!");
        }

        if (resident instanceof Buffalo && buffaloQuantityPerCell < resident.getMaxQuantityPerCell()) {
            buffaloQuantityPerCell++;
            return false;
        } else if (resident instanceof Caterpillar && caterpillarQuantityPerCell < resident.getMaxQuantityPerCell()) {
            caterpillarQuantityPerCell++;
            return false;
        } else if (resident instanceof Deer && deerQuantityPerCell < resident.getMaxQuantityPerCell()) {
            deerQuantityPerCell++;
            return false;
        } else if (resident instanceof Goat && goatQuantityPerCell < resident.getMaxQuantityPerCell()) {
            goatQuantityPerCell++;
            return false;
        } else if (resident instanceof Horse && horseQuantityPerCell < resident.getMaxQuantityPerCell()) {
            horseQuantityPerCell++;
            return false;
        } else if (resident instanceof Rabbit && rabbitQuantityPerCell < resident.getMaxQuantityPerCell()) {
            rabbitQuantityPerCell++;
            return false;
        } else if (resident instanceof Sheep && sheepQuantityPerCell < resident.getMaxQuantityPerCell()) {
            sheepQuantityPerCell++;
            return false;
        } else if (resident instanceof Boar && boarQuantityPerCell < resident.getMaxQuantityPerCell()) {
            boarQuantityPerCell++;
            return false;
        } else if (resident instanceof Duck && duckQuantityPerCell < resident.getMaxQuantityPerCell()) {
            duckQuantityPerCell++;
            return false;
        } else if (resident instanceof Mouse && mouseQuantityPerCell < resident.getMaxQuantityPerCell()) {
            mouseQuantityPerCell++;
            return false;
        } else if (resident instanceof Bear && bearQuantityPerCell < resident.getMaxQuantityPerCell()) {
            bearQuantityPerCell++;
            return false;
        } else if (resident instanceof Boa && boaQuantityPerCell < resident.getMaxQuantityPerCell()) {
            boaQuantityPerCell++;
            return false;
        } else if (resident instanceof Eagle && eagleQuantityPerCell < resident.getMaxQuantityPerCell()) {
            eagleQuantityPerCell++;
            return false;
        } else if (resident instanceof Fox && foxQuantityPerCell < resident.getMaxQuantityPerCell()) {
            foxQuantityPerCell++;
            return false;
        } else if (resident instanceof Wolf && wolfQuantityPerCell < resident.getMaxQuantityPerCell()) {
            wolfQuantityPerCell++;
            return false;
        } else if (resident instanceof Grass && grassQuantityPerCell < resident.getMaxQuantityPerCell()) {
            grassQuantityPerCell++;
            return false;
        } else if (resident instanceof Virus && covidQuantityPerCell < resident.getMaxQuantityPerCell()) {
            covidQuantityPerCell++;
            return false;
        } else {
            return true;
        }
    }

    public boolean checkPlusQuantityPerCellRunning(Resident resident) {
        if (resident instanceof Buffalo && buffaloQuantityPerCell < resident.getMaxQuantityPerCell()) {
            buffaloQuantityPerCell++;
            return false;
        } else if (resident instanceof Caterpillar && caterpillarQuantityPerCell < resident.getMaxQuantityPerCell()) {
            caterpillarQuantityPerCell++;
            return false;
        } else if (resident instanceof Deer && deerQuantityPerCell < resident.getMaxQuantityPerCell()) {
            deerQuantityPerCell++;
            return false;
        } else if (resident instanceof Goat && goatQuantityPerCell < resident.getMaxQuantityPerCell()) {
            goatQuantityPerCell++;
            return false;
        } else if (resident instanceof Horse && horseQuantityPerCell < resident.getMaxQuantityPerCell()) {
            horseQuantityPerCell++;
            return false;
        } else if (resident instanceof Rabbit && rabbitQuantityPerCell < resident.getMaxQuantityPerCell()) {
            rabbitQuantityPerCell++;
            return false;
        } else if (resident instanceof Sheep && sheepQuantityPerCell < resident.getMaxQuantityPerCell()) {
            sheepQuantityPerCell++;
            return false;
        } else if (resident instanceof Boar && boarQuantityPerCell < resident.getMaxQuantityPerCell()) {
            boarQuantityPerCell++;
            return false;
        } else if (resident instanceof Duck && duckQuantityPerCell < resident.getMaxQuantityPerCell()) {
            duckQuantityPerCell++;
            return false;
        } else if (resident instanceof Mouse && mouseQuantityPerCell < resident.getMaxQuantityPerCell()) {
            mouseQuantityPerCell++;
            return false;
        } else if (resident instanceof Bear && bearQuantityPerCell < resident.getMaxQuantityPerCell()) {
            bearQuantityPerCell++;
            return false;
        } else if (resident instanceof Boa && boaQuantityPerCell < resident.getMaxQuantityPerCell()) {
            boaQuantityPerCell++;
            return false;
        } else if (resident instanceof Eagle && eagleQuantityPerCell < resident.getMaxQuantityPerCell()) {
            eagleQuantityPerCell++;
            return false;
        } else if (resident instanceof Fox && foxQuantityPerCell < resident.getMaxQuantityPerCell()) {
            foxQuantityPerCell++;
            return false;
        } else if (resident instanceof Wolf && wolfQuantityPerCell < resident.getMaxQuantityPerCell()) {
            wolfQuantityPerCell++;
            return false;
        } else if (resident instanceof Grass && grassQuantityPerCell < resident.getMaxQuantityPerCell()) {
            grassQuantityPerCell++;
            return false;
        } else if (resident instanceof Virus && covidQuantityPerCell < resident.getMaxQuantityPerCell()) {
            covidQuantityPerCell++;
            return false;
        } else {
            return true;
        }
    }

    public void checkMinusQuantityPerCell(Resident resident) {
        if (resident instanceof Buffalo) {
            buffaloQuantityPerCell--;
        } else if (resident instanceof Caterpillar) {
            caterpillarQuantityPerCell--;
        } else if (resident instanceof Deer) {
            deerQuantityPerCell--;
        } else if (resident instanceof Goat) {
            goatQuantityPerCell--;
        } else if (resident instanceof Horse) {
            horseQuantityPerCell--;
        } else if (resident instanceof Rabbit) {
            rabbitQuantityPerCell--;
        } else if (resident instanceof Sheep) {
            sheepQuantityPerCell--;
        } else if (resident instanceof Boar) {
            boarQuantityPerCell--;
        } else if (resident instanceof Duck) {
            duckQuantityPerCell--;
        } else if (resident instanceof Mouse) {
            mouseQuantityPerCell--;
        } else if (resident instanceof Bear) {
            bearQuantityPerCell--;
        } else if (resident instanceof Boa) {
            boaQuantityPerCell--;
        } else if (resident instanceof Eagle) {
            eagleQuantityPerCell--;
        } else if (resident instanceof Fox) {
            foxQuantityPerCell--;
        } else if (resident instanceof Wolf) {
            wolfQuantityPerCell--;
        } else if (resident instanceof Grass) {
            grassQuantityPerCell--;
        } else if (resident instanceof Covid) {
            covidQuantityPerCell--;
        }
    }

    public int getTotalQuantityPerCell() {
        int totalQuantity = 0;
        totalQuantity += buffaloQuantityPerCell;
        totalQuantity += caterpillarQuantityPerCell;
        totalQuantity += deerQuantityPerCell;
        totalQuantity += goatQuantityPerCell;
        totalQuantity += horseQuantityPerCell;
        totalQuantity += rabbitQuantityPerCell;
        totalQuantity += sheepQuantityPerCell;
        totalQuantity += boarQuantityPerCell;
        totalQuantity += duckQuantityPerCell;
        totalQuantity += mouseQuantityPerCell;
        totalQuantity += bearQuantityPerCell;
        totalQuantity += boaQuantityPerCell;
        totalQuantity += eagleQuantityPerCell;
        totalQuantity += foxQuantityPerCell;
        totalQuantity += grassQuantityPerCell;
        totalQuantity += covidQuantityPerCell;
        totalQuantity += wolfQuantityPerCell;
        return totalQuantity;
    }
}
