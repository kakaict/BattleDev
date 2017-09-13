package creackingCode.recusive;

import java.util.ArrayList;
import java.util.List;


/**
 *
 *khaitq on 14 sept. 2017
 */


/*
 * ABC -> ACB, BCA, BAC, CAB, CBA
 * 
 * AB -> BA
 * 
 */

public class StringPermutation {
	
	public static void main(String[] args){
		
		String s = "ABCDE";
		
		
		test("ABCD");
	}
	
	public static void test(String s){
		
		char c = s.charAt(0);
		
		char[] array = s.substring(1).toCharArray();
		
		System.out.println(tesst(c, array));
		
	}
	
	public static List<String> tesst(char c, char[] array){
		
		List<String> list = new ArrayList<String>();
		if (array.length == 2) {
			
			list.add(c + "" + array[0] + array[1]);
			
			list.add(c + "" + array[1] + array[0]);
		
		} else {
			
			char[] nex = new char[array.length - 1];
			for (int i = 0; i <nex.length; i ++) {
				nex[i] = array[i+1];
			}
			
			List<String> v =  tesst(array[0], nex);
			
			v.forEach(s->{
				list.add(c+ "" +s);
			});
			
			
		}
		
		return list;
	}

}


