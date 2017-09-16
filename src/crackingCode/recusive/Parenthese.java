package crackingCode.recusive;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


/**
 * khaitq on 16 sept. 2017
 * 
 * 
 * Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n-pairs of parentheses.
 * EXAMPLE:
 *
	input: 1 output: {}
	
	input: 2 output: {}{}, {{}}
	
	input: 3 output: {}{}{}, {}{{}}, {{}}{}, {{}{}}, {{{}}}
	
 */

public class Parenthese {

	public static void main(String[] args) {
		
		Set<String> s;
		
//		s =  getParentheseRecusive(10);
		
		s =  getParentheseLinked(8);
		
		System.out.println(s);
		
		System.out.println(s.size());
		
	}

	private static final String unit = "()";
	
	public static Set<String> getParentheseRecusive(int n) {
		
		Set<String> r = new HashSet<String>();
		if(n ==1) {
			r.add(unit );
		}
		
		if (n  > 1) {

			Set<String> r2 = getParentheseRecusive(n-1);
			
			r2.forEach(s->{
				
				for (int i= 0; i < s.length(); i++ ){
					
					String ss =	new StringBuilder(s).insert(i, unit).toString();
					
					r.add(ss);
				}
				
			});
		}
		
		return r;
	}
	
	public static Set<String> getParentheseLinked(int n) {
		
		List<Set<String>> linked = new LinkedList<Set<String>>();
		
		Set<String> sub1 = new HashSet<String>();
		sub1.add(unit );
		linked.add(sub1);
		
		for (int i = 1; i < n; i++){
			
			Set<String> sub = linked.get(i-1);
			
			Set<String> cur = new HashSet<String>();
			
			sub.forEach(s->{
				for (int j= 0; j < s.length(); j++ ){
					String ss =	new StringBuilder(s).insert(j, unit).toString();
					cur.add(ss);
				}
			});
			linked.add(cur);
		}
		
		return linked.get(linked.size()-1);
	}
	

}


