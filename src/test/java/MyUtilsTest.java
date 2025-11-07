/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.example.myutils.MyUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyUtilsTest {

    // Tests originales

    @Test
    void testEsTraspas() {
        assertTrue(MyUtils.esTraspas(2020));
        assertFalse(MyUtils.esTraspas(2019));
        assertTrue(MyUtils.esTraspas(2000));
        assertFalse(MyUtils.esTraspas(1900));
    }

    @Test
    void testEsPrimer() {
        assertTrue(MyUtils.esPrimer(2));
        assertTrue(MyUtils.esPrimer(13));
        assertFalse(MyUtils.esPrimer(15));
        assertFalse(MyUtils.esPrimer(1));
        assertFalse(MyUtils.esPrimer(57));
    }

    @Test
    void testFactorial() {
        assertEquals(1, MyUtils.factorial(0));
        assertEquals(1, MyUtils.factorial(1));
        assertEquals(120, MyUtils.factorial(5));
    }

    @Test
    void testFactorialNegatiu() {
        assertThrows(IllegalArgumentException.class, () -> MyUtils.factorial(-1));
    }

    // Tests nuevos. Comentario modificado por el profe para que se dispare GitHub Actions.

    @Test
    void testInvertirCadena() {
        assertEquals("aloH", MyUtils.invertirCadena("Hola"));
        assertEquals("", MyUtils.invertirCadena(""));
        assertEquals("a", MyUtils.invertirCadena("a"));
    }

    @Test
    void testExtreureMaxim() {
        assertEquals(9, MyUtils.extreureMaxim(new int[]{3,7,1,9}));
        assertEquals(-1, MyUtils.extreureMaxim(new int[]{-5,-1,-10}));
        assertThrows(IllegalArgumentException.class, () -> MyUtils.extreureMaxim(new int[]{}));
    }

    @Test
    void testSumarDigits() {
        assertEquals(10, MyUtils.sumarDigits(1234));
        assertEquals(0, MyUtils.sumarDigits(0));
        assertEquals(6, MyUtils.sumarDigits(-123));
    }

    @Test
    void testProperPrimer() {
        assertEquals(23, MyUtils.properPrimer(20));
        assertEquals(11, MyUtils.properPrimer(10));
        assertTrue(MyUtils.esPrimer(MyUtils.properPrimer(50)));
    }
}
