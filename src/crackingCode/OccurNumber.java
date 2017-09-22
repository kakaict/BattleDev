package crackingCode;

import java.util.HashSet;
import java.util.Set;


/**
 *
 *khaitq on 17 sept. 2017
 *
 *
 *
  Given an unsorted array of integers with each value occuring even number of times except 
  for one of them which occurs odd number of times. 
  Return the element which occurs odd number of times.

  Ex: 3 1 3 4 4 0 0 ==> return 1

 */

public class OccurNumber {

	public static void main(String[] args) {

		
		int t = findNumberOccurOddTime(new int[]{3 ,3 ,4 ,4 ,200, 78, 200});
		
		t = findByBitWise(new int[]{3 ,3 ,4 ,4 ,200, 78, 200, 78, 9});
		
		System.out.println(t);
		
	}
	
	public static int findNumberOccurOddTime(int[] arr){
		
		Set<Integer> setOfElement = new HashSet<Integer>();
		
		for (int i: arr) {
			if (setOfElement.add(i) == false){
				setOfElement.remove(i);
			}
		}
		return (int) setOfElement.toArray()[0];
	}

	/*
	 * XOR : x^X = 0; X^0 =X
	 */
	public static int findByBitWise(int[] arr){
		
		int t = 0;
		for (int i: arr) {
			t = t^i;
		}
		
		return t;
	}
	

}


