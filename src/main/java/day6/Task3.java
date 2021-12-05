package day6;

import day6.classes.Student;
import day6.classes.Teacher;

public class Task3 {
    public static void main(String[] args) {
        Teacher teach1 = new Teacher("Александр Васильевич", "Мат.анализ");
        Student stud1 = new Student("Петров Егор");

        teach1.evalute(stud1);
    }
}
