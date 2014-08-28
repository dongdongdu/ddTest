package dd.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testSayHello() {

        String expect = "Hello Maven";
        String actual = new HelloWorld().sayHello();

        assertEquals(expect, actual);

    }

    @Test
    public void test2() {
        assertTrue(true);
    }

    @Test
    public void test3() {
        assertTrue(true);
    }
}
