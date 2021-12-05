package day9.classes;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p - a) * (p - b)*(p - c));
    }
    @Override
    public double perimeter(){
        return  a + b + c;
    }
}
