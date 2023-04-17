package objects.island;

import interfaces.Resident;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class Сell {

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setResidentList(List<Resident> residentList) {
        this.residentList = residentList;
    }

    private Coordinate coordinate;

    private List<Resident> residentList;

    public ArrayList<Resident> getResidentAndRemove() {
        ArrayList<Resident> residents = new ArrayList<>();
        for (int i = 0; i < residentList.size(); i++) {
            residents.add(residentList.remove(i));
        }
        return residents;
    }

    public List<Resident> getResidentList() {
        return residentList;
    }

    public void setResidentList(ArrayList<Resident> residentList) {
        this.residentList = residentList;
    }

    public Сell(int coordinateX, int coordinateY, ArrayList<Resident> residentList) {
        coordinate = new Coordinate(coordinateX, coordinateY);
        this.residentList = residentList;
    }
}
