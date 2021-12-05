package day6;

import org.junit.jupiter.api.Test;
import day6.classes.Motorbike;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MotorbikeTest extends Tests.AbstractTest {

    Motorbike motorbike = new Motorbike("bmw", "red",2000 );

    @Test
    public void info() {
        motorbike.info();
        assertEquals("Это мотоцикл" + System.lineSeparator(), getOutput());
    }

    @Test
    public void yearDifference() {
        int diff = motorbike.yearDifference(1980);
        assertEquals(20, diff, "Год выпуска мотоцикла 2000, год для сравнения 1980");
    }
}