import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionInvalidSexParameterizedTest {
    private final String sex;
    private final Feline feline;
    private final String expectedMessage;

    public LionInvalidSexParameterizedTest(String sex) {
        this.sex = sex;
        this.feline = new Feline();
        this.expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
    }

    @Parameterized.Parameters(name = "Test {index}: sex: {0}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Альфа-самец"},
                {""},
                {"Unknown"}
        };
    }

    // Test method for throwing an exception
    @Test
    public void exceptionMessageErrorTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion(sex, feline);
        });
        assertEquals(expectedMessage, exception.getMessage());
    }
}