package crackingCode;


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

		
		System.out.println(findNumberOccurOddTime(new int[]{3 ,3 ,4 ,4 ,200, 200, 455}));
	}
	
	public static int findNumberOccurOddTime(int[] arr){
		
		int r = -1;
		
		char[] x = new char[65536];
		
		for (int i = 0; i < arr.length; i++) {
			
			int t = arr[i];
			
			if(x[t] == '\u0000') {
				x[t] = (char) t;
			} else {
				x[t] = '\u0000';
			}
		}
		
		for (int i= 0; i < x.length; i++) {
			if(x[i] != '\u0000') {
				return (int)x[i];
			}
		}
		
		return r;
		
	}
	
	
	

}


