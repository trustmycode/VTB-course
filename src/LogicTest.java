import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogicTest {

    @Test
    public void shouldLeave () {
        int speed = 5;
        String expected = "Игрок выбыл.";
        String actual = Logic.answer(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStay () {
        int speed = 0;
        String expected = "Игрок не выбыл.";
        String actual = Logic.answer(speed);
        Assertions.assertEquals(expected, actual);
    }
}
