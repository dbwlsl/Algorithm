import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		// 수의 개수
		int n = sc.nextInt();
		// 합을 구해야 하는 횟수
		int quizNo = sc.nextInt();
		
		long[] nList = new long[n+1];
		
		for (int i = 1; i <= n; i++) {
			nList[i] = nList[i - 1] + sc.nextInt();
		}
		
		for (int q = 0; q < quizNo; q++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			System.out.println(nList[j] - nList[i-1]);
		}

	}

}
