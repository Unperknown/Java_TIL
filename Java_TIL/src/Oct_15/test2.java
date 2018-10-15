package Oct_15;

public class test2 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 2, 5 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for (int i : arr) System.out.println(i);
		int[] data = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 70) System.out.println(i + 1 + "번째");
		}
		System.out.println(binary_search(data, 70) + "번째");
	}
	
	public static int binary_search(int[] target, int value) {
		int start = 0, end = target.length - 1;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			if (value == target[middle]) {
				return middle + 1;
			}
			else if (value > target[middle]) {
				start = middle + 1;
			}
			else if (value < target[middle]) {
				end = middle - 1;
			}
		}
		
		return -1;
	}
}
