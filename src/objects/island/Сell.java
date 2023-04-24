package objects.island;

import generator.CheckMaxQuantityPerCell;
import interfaces.generalEntity.Resident;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
public class Сell {

    private Coordinate coordinate;
    private  CheckMaxQuantityPerCell checkMaxQuantityPerCell = new CheckMaxQuantityPerCell();
    private List<Resident> residentList;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public List<Resident> getResidentList() {
        return residentList;
    }
    public CheckMaxQuantityPerCell getCheckMaxQuantityPerCell() {
        return checkMaxQuantityPerCell;
    }
    public void setResidentList(List<Resident> residentList) {
        this.residentList = residentList;
    }

    public Сell(int coordinateX, int coordinateY, ArrayList<Resident> residentList) {
        coordinate = new Coordinate(coordinateX, coordinateY);
        this.residentList = residentList;
    }

    public void addResidentToList(Resident resident){
        residentList.add(resident);
    }

    public void addResidentToListWithNumber(Resident resident, int animalNumber){
        residentList.add(animalNumber, resident);
    }

    public Resident removeResidentToList(int animalNumber){
            return residentList.remove(animalNumber);
    }
}
