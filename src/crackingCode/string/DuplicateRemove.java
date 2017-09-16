package crackingCode.string;


/**
 *
 *khaitq on 16 sept. 2017
 *
 *Remove the duplicate characters in a string without using an additional buffer
 */

public class DuplicateRemove {

	public static void main(String[] args) {

		System.out.println(removeDuplicate("aaaa"));
		
	}
	
	public static String removeDuplicate(String s) {
		
		
		boolean[] mask = new boolean[256];
		
		for (int i = 0; i < s.length(); i ++){
			char c = s.charAt(i);
			mask[c] = true;
		}
		
		char[] re = new char[256];
		
		int j= 0;
		
		for (int i = 0; i < mask.length; i++){
			if (mask[i]) {
				char c = (char) i;
				re[j]=c;
				j++;
			}
		}
		
		return new String(re);
	}

}


