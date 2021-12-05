package day9.classes;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c){
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
