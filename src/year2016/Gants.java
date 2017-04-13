package year2016;

import java.util.ArrayList;
import java.util.Scanner;

/*
	Entrée
	Ligne 1 : un entier N compris entre 1 et 1000 représentant le nombre de gants.
	Ligne 2 à N + 1 : une chaîne comprenant entre 1 et 7 caractères en minuscules
 	représentant la couleur d'un gant.

	Sortie
	Un entier représentant le nombre de paires que vous pouvez constituer. 
	Pour constituer une paire, il faut deux gants de la même couleur.
 * 
 */
public class Gants {

	//add in branch Dev
	
	//modif 1 remote

	public static void main(String[] args) {

		String  line;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int N = 0;
		int result = 0;
		ArrayList<String> gants = new ArrayList<String>();
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			if (line.equals("")) 
				break; 
			if (N> 0 && i == N+1)
				break; 
			
			if (i ==0){
				N = Integer.parseInt(line);
			} else {
				if(gants.contains(line)){
					gants.remove(line);
					result ++;
				} else {
					gants.add(line);
				}
			}
			i++;
		}
		sc.close();
		System.out.println("==Result:==");
		System.out.println("====" + result +"===");
	}
	
	

}
