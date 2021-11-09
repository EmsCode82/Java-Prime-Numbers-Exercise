package package1;
public class Primenumber {

	public static void main(String[] args) {
		int isPrime = 143;
		boolean flag = false;
		for (int i = 2; i <= isPrime / 2; ++i  ) {
			//condition for non-prime number
			if (isPrime % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(isPrime + " is a prime number.");
		else
			System.out.println(isPrime + " is not a prime number");

	}

}
