package week1.day1;

public class CheckNum {

	public static void main(String[] args) {
		int number = 15;
		if (number % 3 == 0 && number % 5 == 0) {

			System.out.println("TRIZZ-FIZZ");

		} else if (number % 3 == 0) {

			System.out.println("TRIZZ");
		} else if (number % 5 == 0) {

			System.out.println("FIZZ");
		} else {
			System.out.println("Not divisible by both 5 & 3");
		}

		
	}

}
