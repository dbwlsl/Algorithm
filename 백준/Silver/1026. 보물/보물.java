import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int mod = 0;
		int sum = 0;
		
		String n = sc.nextLine();
		String aInt = sc.nextLine();
		String[] aStrArr = aInt.split(" ");
		Integer[] aIntArr = new Integer[Integer.parseInt(n)];
		
		for (int i = 0; i < aStrArr.length; i++) {
			aIntArr[i] = Integer.parseInt(aStrArr[i]);
		}
		Arrays.sort(aIntArr);
		
		String bInt = sc.nextLine();
		String[] bStrArr = bInt.split(" ");
		Integer[] bIntArr = new Integer[Integer.parseInt(n)];
		
		for (int i = 0; i < bStrArr.length; i++) {
			bIntArr[i] = Integer.parseInt(bStrArr[i]);
		}
		Arrays.sort(bIntArr, Comparator.reverseOrder());

		for (int i = 0; i < Integer.parseInt(n); i++) {
			mod = aIntArr[i] * bIntArr[i];
			sum += mod;
		}
		
		System.out.println(sum);
	}

}
