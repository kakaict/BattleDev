package creackingCode.recusive;

import java.util.*;


/**
 *
 *@author khaitq on 13 sept. 2017
 */

/*
 * Find all sub set of a Set
 */
public class SubSet {

	public static void main(String[] args){
		
		
		Set<String> s = new HashSet<String>();
		
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.add("5");
		
		List<Set<String>> list = find(s);
		
		list.forEach(set -> {
			System.out.print(set);
			System.out.println();
		});
	}
	
	public static List<Set<String>>  findabc(Set<String> set){
		List<Set<String>> result = new ArrayList<Set<String>>();
		return result;
	}
	
	public static List<Set<String>>  find(Set<String> set){
		
		List<Set<String>> result = new ArrayList<Set<String>>();
		
		if (set.size() == 2){
			set.forEach(s -> {
				Set<String> e = new HashSet<String>();
				e.add(s);
				result.add(e);
			});
		}
		
		if (set.size() > 2) {
			
				
				String[] array = (String[]) set.toArray();
				String last = array[array.length - 1];
				set.remove(last);
				
				findSubSet(result, set, last);
			
		}
		
		return result;
	}
	
	public static List<Set<String>> findSubSet(List<Set<String>> list, Set<String> s, String n){
		
		Set<String> stong = new HashSet<String>();
		
		
		for (Set<String> sm : list) {
			sm.forEach(xx -> {
				stong.add(xx);
			});
		}
		
		Set<String> sn = new HashSet<String>();
		sn.add(n);
		list.add(sn);
		
		s.forEach(element -> {
			Set<String> ss = new HashSet<String>();
			ss.add(element);
			ss.add(n);
			list.add(ss);
		});
		
		if (stong.size() >0)
		list.add(stong);
		
		return list;
		
	}
	
	
}


