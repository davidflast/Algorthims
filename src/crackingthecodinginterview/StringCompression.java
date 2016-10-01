package crackingthecodinginterview;
//Compress strings by counts of repeated characters

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by davidflast on 9/30/16.
 */
public class StringCompression {
    public static void main(String[] args) {
        System.out.print(stringCompression("aaabbccd"));
    }

    public static String stringCompression(String s){
        char[] c = s.toCharArray();
        char curChar = c[0];
        int charCount = 1;
        StringBuilder compressed = new StringBuilder();

        for (int i = 1; i < c.length; ++i) {
            if (curChar == c[i]) {
                charCount++;
            } else {
                compressed.append(curChar);
                compressed.append(charCount);
                charCount = 1;
                curChar = c[i];
            }
        }
        compressed.append(curChar);
        compressed.append(charCount);

        return compressed.length() < s.length() ? compressed.toString() : s;
    }
}
