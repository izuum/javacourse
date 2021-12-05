package day6;

import day6.classes.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest extends Tests.AbstractTest {
    Car car = new Car();

    @Test
    public void info() {
        car.info();
        assertEquals("Это автомобиль" + System.lineSeparator(), getOutput());
    }

    @Test
    public void yearDifference() {
        car.setYear(2020);
        int diff = car.yearDifference(1980);
        assertEquals(40, diff, "Год выпуска автомобиля 2020, год для сравнения 1980");
    }

}