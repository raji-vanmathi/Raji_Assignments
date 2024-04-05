package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 123451; // Change this value to check for other numbers

        int originalInput = input;
        int output = 0;

        // Reverse the digits of the input number
        for (; input != 0; input /= 10) {
            int digit = input % 10;
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
