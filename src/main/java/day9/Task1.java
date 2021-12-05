package day9;

import day9.classes.Student;
import day9.classes.Teacher;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Petrov", "PMM");
        Teacher techer = new Teacher("Vasilych", "Matan");
        System.out.println(student.getGroupName());

        System.out.println(techer.getSubjectName());



        student.printInfo();
        techer.printInfo();
    }
}
