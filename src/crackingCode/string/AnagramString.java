package crackingCode.string;

import java.util.Arrays;


/**
 *
 *khaitq on 22 sept. 2017
 */

public class AnagramString {

	public static void main(String[] args) {

		String s1 = "ABCDEF";
		
		String s2 = "AFBCED";
		
		
		System.out.println(checkAnagrams(s1,s2));
		
		System.out.println(checkAnagramsByApi(s1,s2));
		
	}

	private static boolean checkAnagrams(String s1, String s2) {

		int [] mask = new int[256];
		
		if (s1.length() != s2.length()) 
			return false;
		
 		for (int i = 0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			mask[c] ++;
		}
 		
		for (int i = 0; i<s2.length(); i++) {
			char c = s2.charAt(i);
			mask[c] --;
			if (mask[c] <0)
				return false;
		}
		
		for (int i = 0; i<mask.length; i++) {
			if(mask[i] !=0)
				return false;
		}
		
		
		return true;
	}
	
	public static boolean checkAnagramsByApi(String s1, String s2){
		
		char[] a1 = s1.toCharArray();
		Arrays.sort(a1);
		
		char[] a2 = s2.toCharArray();
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
	}

}


