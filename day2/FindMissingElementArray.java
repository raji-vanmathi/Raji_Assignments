package week1.day2;

public class FindMissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 4, 3, 2, 8, 6, 7};
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
	}

}
