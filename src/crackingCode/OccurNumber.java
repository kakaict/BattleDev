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

		
		System.out.println(findNumberOccurOddTime(new int[]{3 ,3 ,4 ,4 ,200, 78, 200}));
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
	
	

}


