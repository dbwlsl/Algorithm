import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			int qData = sc.nextInt();
			q.add(qData);
		}
		
		int data1 = 0;
		int data2 = 0;
		int sum = 0;
		
		while (q.size() > 1) {
			data1 = q.remove();
			data2 = q.remove();
			sum += data1 + data2;
			q.add(data1 + data2);
		}
		
		System.out.println(sum);
	}
}