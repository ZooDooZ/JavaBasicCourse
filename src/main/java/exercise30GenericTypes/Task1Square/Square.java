package exercise30GenericTypes.Task1Square;

public class Square<T extends Number> {

    private T wall;

    public Square(T wall) {
        this.wall = wall;
    }

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }

    public double getSurfaceArea(){
        return wall.doubleValue() * wall.doubleValue();
    }
}
