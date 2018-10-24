package Oct_10;

public class Calculator_Ex extends Calculator{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;

		for (int i : a) {
			sum += i;
		}

		return sum / a.length;
	}

	public static void main(String[] args) {
		Calculator_Ex cal = new Calculator_Ex();

		System.out.println(cal.add(5, 6));

		System.out.println(cal.average(new int[] {1, 2, 100, 4, 5}));
	}
}
