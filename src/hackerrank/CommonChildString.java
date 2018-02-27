package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
*
*khaitq on 27 févr. 2018
*/
/*
 * Given two strings x  and y of equal length, what's the longest string () that can be constructed such that it is a child of both? 

	A string x is said to be a child of a string y if x can be formed by deleting 0 or more characters from y. 
	
	For example, ABCD and ABDC has two children with maximum length 3, ABC and ABD. 
	
	Note that we will not consider ABCD as a common child because C doesn't occur before D in the second string.
	
	=> USE dynamic programming.
 */

public class CommonChildString {

	public static void main(String[] args) {
		
		String s1 = "ABCD";
		String s2 = "ABCF";
		
		System.out.println(getMaxChildSolution1(s1, s2));
	}
	
	static String getMaxChildSolution2(String s1, String s2) {

		return "";
	} 	
	
	static String getMaxChildSolution1(String s1, String s2) {
		
		int L = s1.length();
		if (s1.equals(s2)) {
			return s1;
		}
		
		L--;
		
		while (L > 0) {
			
			Set<String> list1 = findAllChild(s1, L);
			Set<String> list2 = findAllChild(s2, L);
			
			for (String x : list1) {
				if (list2.contains(x)) {
					return x;
				}
			}
			
			L =L - 1;
		}
		
		Set<String> s = new HashSet<String>();
		s.add(new String("ab"));
		
		System.out.println(s.contains(new String("ab")));
		
		
		return "";
	}

	static Set<String> findAllChild(String s, int L) {
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length()-L+1; i++) {
			String sub = new String(s.charAt(i)+"");
			for (int j = i+1; j < L+i; j++) {
				sub += s.charAt(j);
			}
			list.add(sub);
		}
		
		Set<String> sublist = new HashSet<String>();
		
		for (int i = 0; i < list.size()-1; i++ ) {
			
			for (int j = i+1; j< list.size(); j++) {
				
				String sub = new String(list.get(i).substring(0, L-1)+ "");

				String newsub = sub + (list.get(j).charAt(L-1));
				
				sublist.add(newsub);
			}
		}
		
		Set<String> all = new HashSet<String>(list);
		all.addAll(sublist);
		
		return all;
	}

}


