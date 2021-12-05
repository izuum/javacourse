package day9;

import day9.classes.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeacherTest extends Tests.AbstractTest {

    Teacher teacher = new Teacher("anna", "math");

    @Test
    void printInfo() {
        Teacher teacher = new Teacher("anna", "math");
        teacher.printInfo();
        assertEquals("Этот человек с именем anna" + System.lineSeparator() + "Этот преподаватель с именем anna" + System.lineSeparator(), getOutput(),
                "Метод printInfo() вызван у обекта класса Teacher, с полем name = anna");
    }

    @Test
    public void getSubject() {
        String subject = teacher.getSubjectName();
        assertEquals("math", subject, "Метод getSubject() вызван у обекта класса Teacher, с полем subjectName = math");
    }
}