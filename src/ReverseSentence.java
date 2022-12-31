public class ReverseSentence {

	public static void main(String[] args) {
		// Reverse Sentence

		reversalEverything("we are learning java");

	}

	public static void reversalEverything(String sentence) {

		String[] wordStrings = sentence.split(" ");
		StringBuffer tempHolderBuffer = new StringBuffer();
		// Set<String> reverseHolderArrayList = new HashSet<String>();

		for (int i = wordStrings.length - 1; i >= 0; i--) {

			if (i == 0) {

				tempHolderBuffer.append(wordStrings[i]);
			} else {

				tempHolderBuffer.append(wordStrings[i]);
				tempHolderBuffer.append(" ");
			}
		}
		System.out.println(tempHolderBuffer);
	}

}
