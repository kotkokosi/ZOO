package objects.island;

import lombok.Setter;

@Setter
public class Coordinate {
    private int coordinateX;

    private int coordinateY;

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public Coordinate(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
}
