package Oct_22;

import java.util.Arrays;
import java.util.Scanner;

public class Machine_Sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Machine[] machines = new Machine[scan.nextInt()];

		for (int i = 0; i < machines.length; i++) {
			machines[i] = new Machine(scan.nextInt(), scan.nextInt());
		}

		Arrays.sort(machines);

		for (Machine machine : machines) {
			System.out.println(machine.number + " " + machine.gas_size);
		}

		scan.close();
	}
}


class Machine implements Comparable<Machine> {
	int number;
	int gas_size;

	public Machine(int number, int gas_size) {
		this.number = number;
		this.gas_size = gas_size;
	}

	@Override
	public int compareTo(Machine target) {
		return number - target.number;
	}

}