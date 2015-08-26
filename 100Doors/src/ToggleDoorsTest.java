import org.junit.*;
import static org.junit.Assert.*;

public class ToggleDoorsTest {

    @Test
    public void doorsShouldBeClosedWhenPassIsZero() {
        String expected = "100 doors closed and 0 doors open";
        String actual = ToggleDoors.answer(0);
        assertEquals(expected, actual);
    }
    
    @Test
    public void doorsShouldBeOpenWhenPassIsOne() {
        String expected = "0 doors closed and 100 doors open";
        String actual = ToggleDoors.answer(1);
        assertEquals(expected, actual);
    }

    @Test
    public void fiftyDoorsShouldBeClosedWhenPassIsTwo(){
        String expected = "50 doors closed and 50 doors open";
        String actual = ToggleDoors.answer(2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void multiplesOfThreeDoorsShouldBeToggledForThree(){
        String expected = "51 doors closed and 49 doors open";
        String actual = ToggleDoors.answer(3);
        assertEquals(expected, actual);
    }
    @Test
    public void NinetyDoorsShouldBeToggledFor100(){
        String expected = "90 doors closed and 10 doors open";
        String actual = ToggleDoors.answer(100);
        assertEquals(expected, actual);
    }   
    
}