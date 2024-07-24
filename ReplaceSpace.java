package java_07_24_2024;

/**
 * Write a Java program to replace all spaces in a sentence with #. All
 * continuous spaces should be replaced with only one #. Example: There are 3
 * spaces. Should become: There#are#3#spaces.
 */
public class ReplaceSpace {

	public static void main(String[] args) {
		String sentence = "There   are 3 spaces";
		String ans = replaceSpaceFunction(sentence);

		System.out.println("Original Sentence : " + sentence);
		System.out.println("Modified Sentence : " + ans);

	}

	private static String replaceSpaceFunction(String sentence) {
		return sentence.replaceAll("\\s+", "#");
	}
}
