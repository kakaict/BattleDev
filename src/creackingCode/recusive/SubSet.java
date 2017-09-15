package creackingCode.recusive;

import java.util.*;
import java.util.stream.Collectors;


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
		
		list.sort(new Comparator<Set<String>>() {
			@Override
			public int compare(Set<String> o1, Set<String> o2) {
				return o1.size() - o2.size() ;
			}
		});
		
		list.forEach(set -> {
			System.out.print(set);
			System.out.println();
		});
	}
	
	public static List<Set<String>>  find(Set<String> set){
		
		List<Set<String>> result = new ArrayList<Set<String>>();

		if (set.size() == 2){
			set.forEach(s -> {
				Set<String> e = new HashSet<String>();
				e.add(s);
				result.add(e);
			});
			return result;
		}
		
		
		if (set.size() > 2) {
			
			String[] array = new String[set.size()]; 
			set.toArray(array);
			String last = array[array.length - 1];
			set.remove(last);
			
			result.addAll(find(set));
			
			findSubSet(result, last);
			
		}
		
		return result;
	}
	
	public static List<Set<String>> findSubSet(List<Set<String>> list, String n){
		
			Set<String> stong = new HashSet<String>();

			for (Set<String> sm : list) {
				sm.forEach(xx -> {
					stong.add(xx);
				});
			}
			
			
			List<Set<String>> slist = new ArrayList<Set<String>>();
			list.forEach(setx ->{
				Set<String> vv = setx.stream().map(String::new).collect(Collectors.toSet());
				vv.add(n);
				slist.add(vv);
			});
			
			if (stong.size() >0)
			list.add(stong);
			
			Set<String> sn = new HashSet<String>();
			sn.add(n);
			list.add(sn);
			
			list.addAll(slist);
		
		return list;
		
	}
	
	
}


