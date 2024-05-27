import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private List<String> expectedFood;
    private Feline feline;

    @Before
    public void setupFeline() {
        feline = new Feline();
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    @Test
    public void eatMeatFelineTest() throws Exception {
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void familyFelineTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void kittensFelineTest() {
        assertEquals(1, feline.getKittens());
    }
}