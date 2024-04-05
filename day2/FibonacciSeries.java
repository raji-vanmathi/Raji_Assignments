package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range = 8; // Desired range for Fibonacci series

        int firstNum = 0;
        int secondNum = 1;
        int nextNum;

        System.out.print("Generated Fibonacci series: " + firstNum + ", " + secondNum);

        for (int i = 2; i < range; i++) {
            nextNum = firstNum + secondNum;
            System.out.print(", " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
		
	}

}
