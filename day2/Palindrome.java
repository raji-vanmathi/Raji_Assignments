package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123451; // Change this value to check for other numbers

        int originalInput = number;
        int output = 0;

        // Reverse the digits of the input number
        for (; number != 0; input /= 10) {
            int digit = number % 10;
            output = output * 10 + digit;
        }

        // Check if the original input is equal to the reversed output
        if (originalInput == output) {
            System.out.println("Input: " + originalInput + " -> Output: It is a Palindrome");
        } else {
            System.out.println("Input: " + originalInput + " -> Output: It is not a Palindrome");
        }
	}

}
