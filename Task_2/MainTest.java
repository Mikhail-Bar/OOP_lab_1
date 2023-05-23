package Task_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test1() {
        double x = 0.5;
        double acc = 0.0001;
        double cosResult = Math.cos(x);
        double result = Main.sum(x, acc);
        assertEquals(cosResult, result, acc);
    }

    @Test
    public void test2() {
        double x = 1.5;
        double acc = 0.00001;
        double cosResult = Math.cos(x);
        double result = Main.sum(x, acc);
        assertEquals(cosResult, result, acc);
    }

    @Test
    public void test3() {
        double x = -3.5;
        double acc = 0.000001;
        double cosResult = Math.cos(x);
        double result = Main.sum(x, acc);
        assertEquals(cosResult, result, acc);
    }

    @Test
    public void test4() {
        double x = -0.4;
        double acc = 0.0000001;
        double cosResult = Math.cos(x);
        double result = Main.sum(x, acc);
        assertEquals(cosResult, result, acc);
    }

    @Test
    public void test5() {
        double x = -0.25;
        double acc = 0.0000001;
        double cosResult = Math.cos(x);
        double result = Main.sum(x, acc);
        assertEquals(cosResult, result, acc);
    }

}
