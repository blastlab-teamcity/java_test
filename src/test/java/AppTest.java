import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testPrintHello() throws Exception {
        String s = new App().printHello();
        assertEquals("Hello World", s);
    }
}
