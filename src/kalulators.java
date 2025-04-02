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

	}

}
