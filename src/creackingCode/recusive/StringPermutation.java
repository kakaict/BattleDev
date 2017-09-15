package creackingCode.recusive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;


/**
 *
 *khaitq on 14 sept. 2017
 */


/*
 * ABC -> A(BC) B(AC) 
 * 
 */

public class StringPermutation {
	
	public static void main(String[] args){
		
		String s = "ABCD";
		
		int t = 0;
		
//		List<String> list = recusive(s.toCharArray());
//		for (String v: list){
//			System.out.println(v);
//			t++;
//		}
		
		t=0;
		List<List<String>> link = doByLinkList(s.toCharArray());
		for (String v: link.get(link.size()-1)){
			System.out.println(v);
			t++;
		}
		
		System.out.println(t);
	}
	
	
	public static List<String> recusive(char[] array){
		
		List<String> list = new ArrayList<String>();
		
		System.gc();
		
		if (array.length == 2) {
			
			list.add(array[0] + "" + array[1]);
			
			list.add(array[1] + "" + array[0]);
		
		} else {
			
			for (int i = 0; i < array.length; i ++) {
				char c = array[i];
				
				List<String> v =  recusive(truncate(array,i));
				
				v.forEach(s->{
					list.add(c+ "" +s);
				});
			}
		}
		
		return list;
	}

	private static char[] truncate(char[] array, int i) {
		return ArrayUtils.remove(array, i);
	}
	
	/*
	 */
	public static List<List<String>> doByLinkList(char[] array){
		
		List< List<String>> list = new LinkedList<List<String>>();
		
			for (int i = 0; i <array.length; i ++) {
				
				List<String> sublist =  new ArrayList<String>();
				
				if (i == 0) {
					sublist.add(array[i]+"");
				}
				if (i == 1) {
					sublist.add(array[i-1]+""+array[i]);
					sublist.add(array[i]+""+array[i-1]);
					
				}
				if (i > 1) {
						char c= array[i];
						List<String> vv= list.get(list.size()-1);
						sublist = getNext(c, vv);
				}
				
				list.add(sublist);
			}
		
		return list;
	}
	
	/*
	 */
	private static List<String> getNext(char c,List<String> list) {
		List<String> r = new ArrayList<String>();
		for(String s: list){
			char[] array = s.toCharArray();
			for (int i = 0; i <=array.length; i ++){
				char[] newarr = new char[array.length  +1];
				for(int k = 0; k < i; k++){
					newarr[k] = array[k];
				}
				newarr[i] = c;
				for(int k = i+1 ; k <= array.length; k++){
					newarr[k] = array[k-1];
				}
				r.add(new String(newarr));
			}
		}
		return r;
	}

}


