/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.example.myutils.MyUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyUtilsTest {

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
}
