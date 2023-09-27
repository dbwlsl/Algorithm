import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			aArr[i] = Math.abs(sc.nextInt());
			bArr[i] = Math.abs(sc.nextInt());
			
			result += aArr[i] + bArr[i];
		}
		
		System.out.println(result);
	}
}
