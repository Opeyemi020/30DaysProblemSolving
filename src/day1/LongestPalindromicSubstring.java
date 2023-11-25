package day1;public class LongestPalindromicSubstring {    public static String getLongestPalindrome(String inputString){        int right = 0;        int left = 0;        int maximumPalindrome = 0;        String longestPalindrome = "";        for (int index = 0; index < inputString.length(); index++) {            while (left <= right && index - left <= right - index && inputString.charAt(left) == inputString.charAt(right)){                left++;                right--;            }            int currentPalindromeLength = right - left + 1;            if (currentPalindromeLength > maximumPalindrome) {                maximumPalindrome = currentPalindromeLength;                longestPalindrome = inputString.substring(left,left + maximumPalindrome);            }            int ADD_INDEX = index + 1;            if (ADD_INDEX <= right){                if (inputString.charAt(index) == inputString.charAt(ADD_INDEX)){                    left = index;                    right = ADD_INDEX;                }                while (left <= right && index - left <= right - index && inputString.charAt(left) == inputString.charAt(right)){                    left++;                    right--;                }                currentPalindromeLength = right - left + 1;                if (currentPalindromeLength > maximumPalindrome){                    maximumPalindrome = currentPalindromeLength;                    longestPalindrome = inputString.substring(left,left + maximumPalindrome);                }            }        }        return longestPalindrome;    }    public static void main(String[] args) {        String s = "babad";        String longestPalindrome = getLongestPalindrome(s);        System.out.println(longestPalindrome);    }}