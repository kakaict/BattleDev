package creackingCode.recusive;


/**
 *
 *khaitq on 16 sept. 2017
 */

public class DuplicateChar {

	public static void main(String[] args) {

		
		System.out.println(containsDuplicate("ABCDA"));
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


