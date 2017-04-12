package year2016;

import java.util.Scanner;

public class Flocons {
	
	//modif 2 in PC

	public static void main(String[] args) {

		
		String  line;
		Scanner sc = new Scanner(System.in);
		line = sc.nextLine();
		int number = Integer.parseInt(line);
		
		for (int i= 0; i < number; i++){
			for (int j =0; j< number; j++){
				if( i< number/2 +1) {
					if( (j <= number/2 + i) &&	(j >= number/2 - i)) 
						System.out.print("*");
					else 
						System.out.print(".");
				} else {
					if( (j <  number -(i- number/2)) &&	(j >= i -number/2)) 
						System.out.print("*");
					else 
						System.out.print(".");
				}
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
