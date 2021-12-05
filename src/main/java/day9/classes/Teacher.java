package day9.classes;

public class Teacher extends Human {
    private String subjectName;
    public String getSubjectName(){
        return subjectName;
    }

    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s \n", getName());
    }


}
