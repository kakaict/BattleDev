package crackingCode.string;


/**
 *
 *khaitq on 22 sept. 2017
 */

public class AnagramString {

	public static void main(String[] args) {

		String s1 = "FDCAB";
		
		String s2 = "FDCAB";
		
		
		System.out.println(checkAnagrams(s1,s2));
		
	}

	private static boolean checkAnagrams(String s1, String s2) {

		boolean [] mask = new boolean[256];
		
		if (s1.length() != s2.length()) 
			return false;
		
		
		
 		for (int i = 0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			mask[c] = true;
		}
 		
		for (int i = 0; i<s2.length(); i++) {
			char c = s2.charAt(i);
			if (!mask[c]) {
				return false;
			}
		}
		return true;
	}

}


