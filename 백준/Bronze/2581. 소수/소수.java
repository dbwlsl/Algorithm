import java.util.Scanner;

public class Main {
	public static boolean isPrime[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		isPrime = new boolean[n+1];
		getPrime();
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = m; i <= n; i++) {
			if (isPrime[i] == false) {
				sum += i;
				if (min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		
		if (sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

	private static void getPrime() {
		isPrime[0] = true;
		isPrime[1] = true;
		
		for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
			for (int j = i * i; j < isPrime.length; j += i) {
				isPrime[j] = true;
			}
		}
	}

}
