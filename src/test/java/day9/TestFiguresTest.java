package day9;

import day9.classes.Circle;
import day9.classes.Figure;
import day9.classes.Rectangle;
import day9.classes.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFiguresTest extends Tests.AbstractTest {

    Figure[] f;

    @BeforeEach
    public void init() {
        f = new Figure[]{
                new Triangle("Red", 10, 10,10 ),
                new Triangle("Green", 10, 20,30 ),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red",4 ),
                new Circle("Red",10 ),
                new Circle("Blue",5 )
        };
    }

    @Test
    void calculateRedPerimeter() {
        assertEquals(192.9645943005142D, TestFigures.calculateRedPerimeter(f));
    }

    @Test
    void calculateRedArea() {
        assertEquals(530.344455747027D, TestFigures.calculateRedArea(f));
    }
}