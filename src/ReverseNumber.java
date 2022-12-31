
public class ReverseNumber {

	public static void main(String[] args) {
		// Reverse a number and print it out

		reversal(123456789);

	}

	public static void reversal(int number) {

		StringBuffer tempValueBuffer = new StringBuffer(Integer.toString(number));
		System.out.print(Integer.parseInt(tempValueBuffer.reverse().toString()));

	}

}