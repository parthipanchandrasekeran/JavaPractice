import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// Type the duplicate character in a word and the number of times its repeated
		duplicateChar("hello");

	}

	public static void duplicateChar(String word) {

		String[] splitWord = word.split("");

		Map<String, Integer> duplicateCharacterCounter = new LinkedHashMap<String, Integer>();

		for (String letter : splitWord) {

			if (duplicateCharacterCounter.containsKey(letter) == false) {

				duplicateCharacterCounter.put(letter, 1);
			} else {

				duplicateCharacterCounter.put(letter, duplicateCharacterCounter.get(letter) + 1);
			}
		}

		duplicateCharacterCounter.forEach((letter, count) -> {

			if (count > 1) {

				System.out.println("Duplicate Letter - " + letter + "\nCount - " + count);
			}
		});

	}

}
