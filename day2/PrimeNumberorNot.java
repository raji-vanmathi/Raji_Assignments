package week1.day2;

public class PrimeNumberorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int n = 2; // Change this value to check for other numbers
        
        boolean isPrime = true;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

}
}
