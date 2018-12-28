
public class PrimeNumber extends Thread {

	private int id;
	private int min;
	private int max;

	public PrimeNumber(int id, int min, int max) {
		super();
		this.id = id;
		this.min = min;
		this.max = max;
	}

	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long startTime = System.currentTimeMillis();

		int numPrime = 0;

		for (int i = min; i <= max; i++)
			if (checkPrime_MoreEfficient(i))
				numPrime++;

		long endTime = System.currentTimeMillis();

		System.out.println(id + " --- " + numPrime + " --- " + (endTime - startTime));
	}

	private boolean checkPrime(int n) {
		boolean flag = true;
		
		for (int j = 2; j < n; j++)
			if (n % j == 0)
				flag = false;
		
		return flag;
	}
	
	private boolean checkPrime_Efficient(int n) {
		for (int j = 2; j < n; j++)
			if (n % j == 0)
				return false;
		return true;
	}
	
	private boolean checkPrime_MoreEfficient(int n) {
		for (int j = 2; j <= Math.sqrt(n); j++)
			if (n % j == 0)
				return false;
		return true;
	}


}
