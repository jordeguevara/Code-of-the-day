
public class PrimeNumber_Test {

	public static void main(String[] args) throws InterruptedException {

		long startTime = System.currentTimeMillis();

		PrimeNumber primeNumber_1 = new PrimeNumber(1, 1, 25000);
		primeNumber_1.start();
//		Thread.sleep(1000);

		PrimeNumber primeNumber_2 = new PrimeNumber(2, 25001, 50000);
		primeNumber_2.start();
//		Thread.sleep(1000);

		PrimeNumber primeNumber_3 = new PrimeNumber(3, 50001, 75000);
		primeNumber_3.start();
//		Thread.sleep(1000);

		PrimeNumber primeNumber_4 = new PrimeNumber(4, 75001, 100000);
		primeNumber_4.start();
//		Thread.sleep(1000);

		long endTime = System.currentTimeMillis();

		System.out.println("Main thread running time: " + (endTime - startTime));
	}

}
