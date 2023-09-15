import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String n = sc.next();	// 과일의 개수
		String l = sc.next();	// 스네이크버드의 초기 길이
		
		int length = Integer.parseInt(l);
		List<Integer> hList = new ArrayList<Integer>();

		// 과일의 높이(사용자 입력값) 리스트에 담기
		for (int i = 0; i < Integer.parseInt(n); i++) {
			hList.add(sc.nextInt());
		}

		Collections.sort(hList); // 오름차순 정렬
		
		for (int h : hList) {
			// 스네이크버드 길이가 과일의 높이보다 크거나 같을 때
			if (length >= h) {
				length++;
			}
		}
		
		System.out.println(length);
	}
}