package crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

    public static void main(String[] args) {
        String stringOne = "jaba";
        String stringTwo = "bjaa";
        System.out.println(checkPermutationHashMap(stringOne, stringTwo));
    }

    private static boolean checkPermutation(String stringOne, String stringTwo) {
        int[] arrayOne = new int[128];
        int[] arrayTwo = new int[128];
        for (char c : stringOne.toCharArray()) {
            arrayOne[c] += 1;
        }

        for (char c : stringTwo.toCharArray()) {
            arrayTwo[c] += 1;
        }

        for (int i = 0; i < 128; ++i) {
            if (arrayOne[i] != arrayTwo[i]) {
                return false;
            }
        }
        return true;
    }


    private static boolean checkPermutationHashMap(String stringOne, String stringTwo) {
        return countFrequency(stringOne).equals(countFrequency(stringTwo));
    }

    private static Map<Character, Integer> countFrequency(String string) {
        Map<Character, Integer> frequency = new HashMap<>(string.length());
        for (char c : string.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        return frequency;
    }
}
