package day3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test extends Tests.AbstractTest {
    @Test
    public void ShouldWorkProperly() {
        setInput("4 2\n100 0\n13 10\n5 2\n0 0\n");
        Task3.main(new String[0]);
        assertEquals("2.0" +System.lineSeparator() +
                "Деление на 0" +System.lineSeparator() +
                "1.3" +System.lineSeparator() +
                "2.5" +System.lineSeparator() +
                "Деление на 0" +System.lineSeparator(), getOutput(), "4 2     13 10     5 2     0 0");
    }

}