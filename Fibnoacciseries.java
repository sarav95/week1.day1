package week1.day1.assignment;

public class Fibnoacciseries {

	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1, sum = 0;

		System.out.println("Fibonacci series are:" + firstNum + "\n" + secNum);
		for (int i = 1; i <= range - 2; i++) {
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;

		}
	}

}
