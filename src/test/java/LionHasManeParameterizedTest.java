import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeParameterizedTest {
    private final boolean expected;
    private final Lion lion;

    public LionHasManeParameterizedTest(String sex, boolean expected) throws Exception {
        this.expected = expected;
        Feline feline = new Feline();
        this.lion = new Lion(sex, feline);
    }

    @Parameterized.Parameters(name = "Test {index}: sex: {0} expected: {1}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test()
    public void createLionMaleTest() {
        assertEquals(expected, lion.doesHaveMane());
    }
}