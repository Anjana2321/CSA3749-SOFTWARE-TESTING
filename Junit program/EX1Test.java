import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EX1Test{

    @Test
    public void testReverseString() {
        String reversedStr = EX1.reverseString("Hello");
        assertEquals("olleH", reversedStr);
    }
}

java -cp .;junit-4.13.2.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore EX1Test
JUnit version 4.13.2