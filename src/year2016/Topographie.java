package year2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Topographie {
	
	//modif 1 in local
	public static void main(String[] args) {

		String line;
		int N = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		List<Cicle> list = new ArrayList<>();

		while (sc.hasNextLine()) {
			line = sc.nextLine();
			
			if (line.equals("")) 
				break; 
			if (N> 0 && i == N+1)
				break; 
			
			if (i ==0){
				N = Integer.parseInt(line);
			} else {
				String[] data = line.split(" ");
				System.out.println(line);
				list.add(new Cicle(Integer.parseInt(data[0]), Integer
						.parseInt(data[1]), Integer.parseInt(data[2])));

			}
			i++;
		}

		sc.close();
		System.out.println("begin list : " +list.size());
		
		boolean f = true;
		for (int j = 0; j < list.size() - 2; j++) {
			Cicle c = list.get(j);
			for (int k = j + 1; k < list.size() - 1; k++) {
				f = validateCicle(c, list.get(k));
				if (f == false) {
					System.out.println("vcl "  + c.getX() + "- " +c.getY() + " -   " + list.get(k).getX() + " -" + list.get(k).getY());
					break;
				}
			}
		}

		System.out.println("result " + f);

	}

	private static boolean validateCicle(Cicle c1, Cicle c2) {
		double d = Math.sqrt(Math.pow((c1.getX() - c2.getX()), 2)
				+ Math.pow((c1.getY() - c2.getY()), 2));
		return d > (c1.getR() + c2.getR());
	}

	public static class Cicle {

		private int x;
		private int y;
		private int r;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getR() {
			return r;
		}

		public void setR(int r) {
			this.r = r;
		}

		public Cicle(int x, int y, int r) {
			this.r = r;
			this.x = x;
			this.y = y;
		}
	}

}
