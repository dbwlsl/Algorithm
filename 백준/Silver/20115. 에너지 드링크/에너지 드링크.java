import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		int[] list = new int[n];
		
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
			max = list[i] > max ? list[i] : max;
		}
		
		double sum = max;
		
		for (int i = 0; i < n; i++) {
			if(list[i] != max)	sum += (double)list[i] / 2;
		}
		
		System.out.println(sum);
	}

}
