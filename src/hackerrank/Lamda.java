package hackerrank;


/**
 *
 *@author khaitq on 10 sept. 2017
 */


interface PerformOperation {
	 boolean check(int a);
}

class MyMath {
	 public static boolean checker(PerformOperation p, int num) {
		 return p.check(num);
	 }
	 
	 public PerformOperation isOdd(){
		return new PerformOperation() {
			@Override
			public boolean check(int a) {
		          if (a%2 == 0) 
		              return false;
		          return true;
			}
		};
	 }
	 
	 public PerformOperation isPrime(){
		 return new PerformOperation() {
			@Override
			public boolean check(int a) {
				int t = a/2;
		          for (int i = 2; i < t; i++){
		              if (a%i ==0){
		                 return false;
		              }
		          }
		          return true;
			}
		};
	 }
	 
	 public PerformOperation isPalindrome(){
		    return new PerformOperation() {
				@Override
				public boolean check(int a) {
					int palindrome = a;
		            int reverse = 0;

		            while (palindrome != 0) {
		                int remainder = palindrome % 10;
		                reverse = reverse * 10 + remainder;
		                palindrome = palindrome / 10;
		            }

		            return a == reverse; 
				}
			};
	 }
}

public class Lamda {
	
	public static void main(String... args){

		System.out.println( new MyMath().isOdd().check(52));
		
		System.out.println( new MyMath().isPrime().check(61));
		
		System.out.println( new MyMath().isPalindrome().check(101));
		

	}

}


