package day9.classes;

public class Human {
    private String name;

    public String getName(){
        return name;
    }

    public Human(String name){
        this.name = name;
    }
    public void printInfo(){
        System.out.printf("Этот человек с именем %s\n", name);
    }
}
