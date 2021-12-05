package day9.classes;

public class Student extends Human {
    private String groupName;

    public String getGroupName(){
        return groupName;
    }


    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Этот студент с именем %s\n", getName());
    }
}
