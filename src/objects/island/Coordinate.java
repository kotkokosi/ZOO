package objects.island;

public final class Coordinate {
    private final int ID;
    private final int coordinateX;
    private final int coordinateY;

    public Coordinate(int coordinateY, int coordinateX) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.ID = coordinateX * coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public int getID() {
        return ID;
    }
}
