package generator;


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

@Getter
@Setter
public class CheckMaxQuantityPerCell {
    private static int buffaloQuantityPerCell = 0;
    private static int caterpillarQuantityPerCell = 0;
    private static int deerQuantityPerCell = 0;
    private static int goatQuantityPerCell = 0;
    private static int horseQuantityPerCell = 0;
    private static int rabbitQuantityPerCell = 0;
    private static int sheepQuantityPerCell = 0;
    private static int boarQuantityPerCell = 0;
    private static int duckQuantityPerCell = 0;
    private static int mouseQuantityPerCell = 0;
    private static int bearQuantityPerCell = 0;
    private static int boaQuantityPerCell = 0;
    private static int eagleQuantityPerCell = 0;
    private static int foxQuantityPerCell = 0;
    private static int grassQuantityPerCell = 0;
    private static int covidQuantityPerCell = 0;
    private static int wolfQuantityPerCell = 0;


    public boolean checkPlusQuantityPerCell(Resident resident) {
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
        } else if (resident instanceof Covid && covidQuantityPerCell < resident.getMaxQuantityPerCell()) {
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

    public void cleanFields(){
        buffaloQuantityPerCell = 0;
        caterpillarQuantityPerCell = 0;
        deerQuantityPerCell = 0;
        goatQuantityPerCell = 0;
        horseQuantityPerCell = 0;
        rabbitQuantityPerCell = 0;
        sheepQuantityPerCell = 0;
        boarQuantityPerCell = 0;
        duckQuantityPerCell = 0;
        mouseQuantityPerCell = 0;
        bearQuantityPerCell = 0;
        boaQuantityPerCell = 0;
        eagleQuantityPerCell = 0;
        foxQuantityPerCell = 0;
        grassQuantityPerCell = 0;
        covidQuantityPerCell = 0;
        wolfQuantityPerCell = 0;
    }



}
