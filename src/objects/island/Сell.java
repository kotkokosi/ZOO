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

    public Сell(int coordinateX, int coordinateY, ArrayList<Resident> residentList) {
        coordinate = new Coordinate(coordinateX, coordinateY);
        this.residentList = residentList;
    }

    public void addResidentToList(Resident resident){
        residentList.add(resident);
    }

    public Resident removeResidentToList(){
            return residentList.remove(0);
    }
}
