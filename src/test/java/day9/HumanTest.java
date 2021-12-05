package day9;

import day9.classes.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest extends Tests.AbstractTest {

    @Test
    void printInfo() {
        Human human = new Human("andrey");
        human.printInfo();
        assertEquals("Этот человек с именем andrey" + System.lineSeparator(), getOutput(), "Метод printInfo() вызван у "
                + "обекта класса Human, с полем name = andrey");
    }

}