package day1;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;class ReverseIntegerTest {    @Test    void testReverseInteger(){        ReverseInteger integer = new ReverseInteger();        int actual = integer.reverse(123);        int expected = 321;        assertEquals(expected,actual);    }}