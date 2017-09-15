package creackingCode.recusive;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;


/**
 *
 *khaitq on 14 sept. 2017
 */


/*
 * ABC -> A(BC) B(AC) 
 * 
 * 
 */

public class StringPermutation {
	
	public static void main(String[] args){
		
		String s = "ABCDEFGI";
		
		List<String> list = recusive(s.toCharArray());
		
		list.forEach(ss->{
			System.out.println(ss);
		});
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
	
	public static List<String> doByLinkList(char[] array){
		
		List<String> list = new ArrayList<String>();
		
		if (array.length == 2) {
			
			list.add(array[0] + "" + array[1]);
			
			list.add(array[1] + "" + array[0]);
		
		} else {
			
			for (int i = 0; i <array.length; i ++) {
				char c = array[i];
				
				List<String> v =  doByLinkList(truncate(array,i));
				
				v.forEach(s->{
					list.add(c+ "" +s);
				});
			}
		}
		
		return list;
	}

}


