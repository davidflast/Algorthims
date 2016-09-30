package crackingthecodinginterview;

import java.util.Map;
import java.util.HashMap;
// Given a string, check if it is a permutation of a palindrom
/**
 * Created by davidflast on 9/30/16.
 */
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
        for (Object value : palindrome.values()) {
            if ((int) value % 2 == 1) {
                numOdd++;
            }
        }
        if (numOdd > 1) {
            return false;
        }

        return true;
    }
}
