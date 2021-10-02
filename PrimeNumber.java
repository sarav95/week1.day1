package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 13;
		boolean f = false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				f = true;
			}

		}
		if (f == true) {
			System.out.println("Not Prime" + number);

		} else {
			System.out.println("prime" + number);
		}
	}

}
