package day2;import java.util.stream.IntStream;public class PalindromeChecker {    public boolean checkPalindrome(int inputInteger) {        if (inputInteger < 0) {            return false;        }        int reversedInteger = reverse(inputInteger);        if (reversedInteger==inputInteger){            return true;        }return false;    }    public static int reverse(int inputNumber) {        long reversed = 0;        int ten = 10;        for (int index = inputNumber; index != 0; index /= 10) {            long digit = index % ten;            reversed = reversed * ten + digit;            if ((reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)) {                return 0;            }        }        return (int) reversed;    }}