package day6;import java.util.*;public class LetterCombinations {    private static final Map<Character, String[]> LETTERS = new HashMap<>();    static {        LETTERS.put('2', new String[]{"a", "b", "c"});        LETTERS.put('3', new String[]{"d", "e", "f"});        LETTERS.put('4', new String[]{"g", "h", "i"});        LETTERS.put('5', new String[]{"j", "k", "l"});        LETTERS.put('6', new String[]{"m", "n", "o"});        LETTERS.put('7', new String[]{"p", "q", "r", "s"});        LETTERS.put('8', new String[]{"t", "u", "v"});        LETTERS.put('9', new String[]{"w", "x", "y", "z"});    }    public  List<String> letterCombinations(String digits){     if (digits.isEmpty()){         return new ArrayList<>();    }     List<String> combinations = new ArrayList<>();     String emptyString = "";     backtrack(digits, emptyString, combinations);     return combinations;}private static void backtrack(String digits, String current, List<String> combinations) {    if (digits.isEmpty()) {        combinations.add(current);        return;    }    Character digit = digits.charAt(0);    String[] letters = LETTERS.get(digit);    for (String letter : letters) {        String nextCurrent = current + letter;        backtrack(digits.substring(1), nextCurrent, combinations);    }}}