package Oct_15;

public class test1 {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 3, 1 };
		int[] jarr = { 2, 4, 1, 3, 1 };
		char[] ox = new char[5];
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			ox[i] = (arr[i] == jarr[i]) ? 'O' : 'X';
			cnt += (ox[i] == 'O') ? 1 : 0;
			System.out.println(arr[i] + " " + jarr[i] + " " + ox[i]);
		}
		
		System.out.println("���� : " + cnt * 20 + "��");
		
		int[] arr2 = { 5, 1, 3, 2, 5, 3, 2, 4, 5, 1 };
		/*for (int i = 1; i <= 5; i++) {
			int tmp_cnt = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] == i) tmp_cnt++;
			}
			System.out.println(i + "�� ����: " + tmp_cnt + "��");
		}*/
		int[] cnt_arr = new int[5];
		for (int i : arr2) {
			cnt_arr[i - 1]++;
		}
		for (int i = 1; i <= 5; i++) System.out.println(i + "�� ����: " + cnt_arr[i - 1] + "��");
	}

}
