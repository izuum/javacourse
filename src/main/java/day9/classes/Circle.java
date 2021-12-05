package day9.classes;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return ((2*Math.PI)*radius);
    }
}
