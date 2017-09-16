package crackingCode.string;


/**
 *
 *khaitq on 16 sept. 2017
 *
 *Find duplicate character in a String, do not use an additional data struct
 *
 * Note : char -> int  will get ascii value)   0 - 256 for all characters
 * 
 * -> can use an array of boolean to present all characters
 */

public class DuplicateChar {

	public static void main(String[] args) {

		
		System.out.println(containsDuplicate("ABCDA"));
		
		System.out.println(containsDuplicate("ABCDEFGH"));
		
	}
	
	public static boolean containsDuplicate(String s) {
		
		
		boolean[] result = new boolean[256];
		
		for (int i = 0; i < s.length(); i++){
			
			char c = s.charAt(i);
			if (result[c] == true) {
				return true;
			}
			result[c] = true;
		}
		
		return false;
	}

}


