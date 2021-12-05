package day9.classes;

public class Rectangle extends Figure{
    private int height;
    private int weight;

    public Rectangle(String color, int height, int weight){
        super(color);
        this.height = height;
        this.weight = weight;
    }
    @Override
    public double area(){
        return height*weight;
    }
    @Override
    public double perimeter(){
        return height+weight+height+weight;
    }
}
