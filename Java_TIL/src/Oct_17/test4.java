package Oct_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test4 {
	public static void main(String[] args) {
		/*int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
		}
		//Java의 foreach문은 대상 객체의 데이터 값을 call-by-value로 전달->수정 불가능
		//그러므로 일반 for문으로 처리
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}*/
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			list.add((int)(Math.random() * 45) + 1);
		}
		
		Collections.sort(list);
		
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}
