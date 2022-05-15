import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @BeforeAll
    public static void beforeAllMethod(){
        System.out.println("BeforeAll");
    }

    @Test
    public void testEqualsTwoDouble (){
        double a = 15.05;
        float b = (float) 15.05;
        double c = 0.1, expected = 0;
        double result = Main.equalsTwoDouble(a,b,c);
        assertEquals(result,expected);

    }

    @Test
    public void testRoundNumber(){
        double a = 15.54, expected = 16;
        double result = Main.roundNumber(a);
        assertEquals(result,expected);

    }

    @Test
    public void testDiscardPart(){
        double a = 15.54, expected = 15;
        double result = Main.discardPart(a);
        assertEquals(result,expected);

    }


}
