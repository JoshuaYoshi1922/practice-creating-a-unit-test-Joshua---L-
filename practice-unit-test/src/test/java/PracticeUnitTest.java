import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

 public class PracticeUnitTest {
    @Test
    public void testItsHot() {
        PracticeUnit practiceUnit = new PracticeUnit();
        assertEquals("It's hot", practiceUnit.whatsTheWeather(90));
    }

    @Test
     public void testItsTooHot() {
        PracticeUnit practiceUnit = new PracticeUnit();
        assertEquals("It's too HOTT", practiceUnit.whatsTheWeather(96));
    }

    @Test
     public void testWinterIsComing() {
        PracticeUnit practiceUnit = new PracticeUnit();
        assertEquals("Winter is Coming",practiceUnit.whatsTheWeather(54));
    }

     @Test
     public void testJustAboutRight() {
         PracticeUnit practiceUnit = new PracticeUnit();
         assertEquals("Just about right", practiceUnit.whatsTheWeather(80));
     }

     @Test
     public void testSweaterWeather() {
         PracticeUnit practiceUnit = new PracticeUnit();
         assertEquals("Sweater Weather", practiceUnit.whatsTheWeather(59));
     }

     @Test
     public void testWinterAt90() {
        PracticeUnit practiceUnit = new PracticeUnit();
        assertNotEquals("Winter is Coming", practiceUnit.whatsTheWeather(90), "Can't have snow above 40 degrees!");
     }
}