import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		String x = sc.next();
		String y = sc.next();
		
		// 최솟값 구하기 위한 x, y
		String minX = null;
		String minY = null;
		// 최댓값 구하기 위한 x, y
		String maxX = null;
		String maxY = null;
		
		// 두 수의 합 중 최솟값, 최댓값 (최종 결과값)
		int min = 0;
		int max = 0;
		
		// 첫번째, 두번째 입력 값에 5 or 6이 들어오면 5로 변경 (6 -> 5) => 최솟값 구하기 위한 변수 치환
		if (x.contains("6") || y.contains("6")) {
			minX = x.replaceAll("6", "5");
			minY = y.replaceAll("6", "5");
		} else {
			minX = x;
			minY = y;
		}
	
		// 첫번째, 두번째 입력 값에 5 or 6이 들어오면 6으로 변경 (5 -> 6) => 최댓값 구하기 위한 변수 치환
		if (x.contains("5") || y.contains("5")) {
			maxX = x.replaceAll("5", "6");
			maxY = y.replaceAll("5", "6");
		} else {
			maxX = x;
			maxY = y;
		}
		
		// 두 수의 합 중 최솟값과 최댓값 구하기
		min = Integer.parseInt(minX) + Integer.parseInt(minY); 
		max = Integer.parseInt(maxX) + Integer.parseInt(maxY); 
		 
		System.out.println(min + " " + max);
	}
}