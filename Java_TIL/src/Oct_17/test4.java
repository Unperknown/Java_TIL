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
		//Java�� foreach���� ��� ��ü�� ������ ���� call-by-value�� ����->���� �Ұ���
		//�׷��Ƿ� �Ϲ� for������ ó��
		
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
