package creackingCode.recusive;

import java.util.ArrayList;
import java.util.List;


/**
 * khaitq on 16 sept. 2017
 * 
 * 
 * Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n-pairs of parentheses.
 * EXAMPLE:
 * input: 3 (3 pairs of parentheses)
 * output: ()()(), ()(()), (())(), ((()))   (()())
 * 
 * 2 paires => ()(), (())
 * 			 ()()(), ()(()), (())(), ((()))   (()())
 */

public class Parenthese {

	public static void main(String[] args) {
		
		System.out.println(getParenthese(2));
		
		
	}

	private static final String unit = "()";
	
	public static List<String> getParenthese(int n) {
		
		List<String> r = new ArrayList<String>();
		if(n ==1) {
			r.add(unit );
		}
		
		if(n==2) {
			r.add(unit+unit);
			r.add("(" + unit + ")");
		}
		
		if (n  > 2) {
			//TODO
			List<String> r2 = getParenthese(n-1);

		
		}
		
		return r;
	}

}


