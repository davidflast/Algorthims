package crackingthecodinginterview;

import java.util.HashSet;

public class IsUnique {

	public static void main(String[] args) {
		String string = "hepfll";
		int length = string.length();
		boolean isUnique = false;
		for(int i = 0; i < length; ++i){
			for(int j = 1; (j + i) < length; ++j){
				char c = string.charAt(i);
				char compare = string.charAt(i + j);
				if(c == compare){
					isUnique = true;
					break;
				}
			}
			if(isUnique){
				break;
			}
		}
		System.out.println(isUnique);
		
	}

	static boolean isUnique(String string) {
		HashSet<Character> set = new HashSet<>(string.length());
		for (char c : string.toCharArray()) {
			set.add(c);
		}
		return set.size() == string.length();
	}

	static boolean isStreamUnique(String string) {
		return string.chars().distinct().count() == string.length();
	}
}
