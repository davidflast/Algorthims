package crackingthecodinginterview;

import java.util.Map;
import java.util.HashMap;
// Given a string, check if it is a permutation of a palindrome

public class PalindromePermutation {

    public static void main(String[] args){
        System.out.print(checkPalindrome("Tactcoa"));
    }
    public static boolean checkPalindrome(String string) {
        int numOdd = 0;
        Map<Character, Integer> palindrome = new HashMap<>(string.length());
        for (char c : string.toCharArray()) {
            palindrome.put(c, palindrome.getOrDefault(c, 0) + 1);
        }
        for (Integer value : palindrome.values()) {
            if (value % 2 == 1) {
                numOdd++;
            }
        }
        return numOdd <= 1;
    }
}
