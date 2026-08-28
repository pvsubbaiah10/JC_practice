package Arrays;

public class missing_number_in_an_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6,7 };

		int n = a.length + 1;

		int expectedsum = n * (n + 1) / 2;
		int actualsum = 0;
		for (int num : a) {

			actualsum = actualsum + num;// 16
		}
		System.out.println(expectedsum - actualsum);
	}

}
