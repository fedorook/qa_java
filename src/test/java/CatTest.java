import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private List<String> expectedFood;
    //Feline object mock creation
    @Mock
    Feline feline;

    Cat cat;

    @Before
    public void setCat() {
        // Creating a Cat instance with Feline mock object
        cat = new Cat(feline);
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    @Test
    public void soundCatTest() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void foodCatTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood, cat.getFood());
    }
}