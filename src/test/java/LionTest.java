import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private List<String> expectedFood;
    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void setupFeline() throws Exception {
        lion = new Lion("Самец", feline);
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    @Test
    public void getKittensLionTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void foodLionTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, lion.getFood());
    }
}