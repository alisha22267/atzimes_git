import java.text.DecimalFormat;
import java.util.Scanner;

public class kalulators {

	public static void main(String[] args) {
		int studSk, kritSk;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.#");
		
		do {
			System.out.println("Cik studentiem aprekinat gala vertejumu?");
			while(!scan.hasNext()) {
				System.out.println("Cik studentiem aprekinat gala vertejumu?");
				scan.next();
			}
			studSk = scan.nextInt();
		} while(studSk<1);
		String[] studenti = new String[studSk];
		
		do {
			System.out.println("Kads bus kriteriju skaits?");
			while(!scan.hasNextInt()) {
				System.out.println("Kads bus kriteriju skaits?");
				scan.next();
			}
			kritSk = scan.nextInt();
		} while(kritSk<1);
		String[] kriteriji = new String[kritSk];
		int[] svars = new int[kritSk];
		int[][] vertejums = new int[studSk][kritSk];
		double[] semestrs = new double[studSk];
	}

}
