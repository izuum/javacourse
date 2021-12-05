package day6.classes;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;


    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public void evalute(Student student){
        String grade = null;
        Random rand = new Random();
        int g = rand.nextInt(2, 6);
        switch(g) {
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
        }

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s", this.name, student.getName(), this.subject, grade);
    }
}
