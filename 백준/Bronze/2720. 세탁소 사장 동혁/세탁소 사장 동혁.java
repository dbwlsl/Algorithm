import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine(); 
		int d = Integer.parseInt(str);
		
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		int result;
		for(int i = 0; i < d; i++) {
			int nt = sc.nextInt();
			
			System.out.print(nt / quarter + " ");
			result = nt % quarter;
			System.out.print(result / dime + " ");
			result = result % dime;
			System.out.print(result / nickel + " ");
			result = result % nickel;
			System.out.print(result / penny + " ");
			result = result % penny;
		}
	}
}
