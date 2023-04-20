package exceptions;

public class MaxQuantityPerCell extends RuntimeException{
    public MaxQuantityPerCell(String message){
        super(message);
    }
}
