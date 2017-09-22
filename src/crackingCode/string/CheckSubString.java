package crackingCode.string;


/**
 *
 *khaitq on 22 sept. 2017
 *
 *Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using 
 * only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 */

public class CheckSubString {

	public static void main(String[] args) {

		String s1  ="ABCDE";
		
		String s2 = "CDEAB";
		
		System.out.println(isRotation(s1, s2));
		
	}
	
	
	
	public static boolean isRotation(String s1, String s2) {
		return isSubString(s2, s1 +s1);
	}
	
	public static boolean isSubString(String s1, String s2) {
		return s2.contains(s1);
	}

}


