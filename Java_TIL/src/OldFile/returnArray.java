public class ReturnArray {

	static int[] createArray(int max_index) {
		int temp[] = new int[max_index];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}
	public static void main(String[] args) {
		int array[];
		array = createArray(10);
		for (int i : array) {
			System.out.println(array[i]);
		}
	}
}
