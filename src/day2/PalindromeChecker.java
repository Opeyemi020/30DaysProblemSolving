package day2;import java.util.stream.IntStream;public class PalindromeChecker {    public boolean checkPalindrome(int input_integer) {        if (input_integer < 0) {            return false;        }        int numDigits = (int) Math.floor(Math.log10(input_integer) + 1);        int divisor = (int) Math.pow(10, numDigits / 2);        for (int i = 0; i < numDigits / 2; i++) {            if ((input_integer / divisor % 10) != (input_integer % 10)) {                return false;            }            input_integer /= 10;            input_integer %= 100;        }        return true;    }}