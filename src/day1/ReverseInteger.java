package day1;public class ReverseInteger {    public int reverse(int input_number) {        long reversed = 0;        int TEN = 10;        for (int index = input_number; index != 0; index /= 10) {            long digit = index % TEN;            reversed = reversed * TEN + digit;            if ((reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)) {                return 0;            }        }        return (int) reversed;    }}