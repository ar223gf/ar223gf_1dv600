/**
 * 
 */
package hangman;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import hangman.HangmanMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HangmanMethodsTest2 {

	HangmanMethods object1;
	public static String theWord;

	@BeforeEach
	void startB() {

	}

	@Test
	public void fortheLine() {
		// It should Create An StringBuilder Of UnderScores
		String stringOfTestingWord = ("aword");
		StringBuilder MethodResult = object1.theLine(stringOfTestingWord);
		StringBuilder ExpectedResult = new StringBuilder();
		for (int i = 0; i < stringOfTestingWord.length(); i++) {
			ExpectedResult.append("-");
		}
		assertEquals(ExpectedResult.toString(), MethodResult.toString());

	}

	@Test
	public void secodFortheLine() {
		// It should Create An StringBuilder Of UnderScores
		String stringOfTestingWord = ("newword");
		StringBuilder MethodResult = object1.theLine(stringOfTestingWord);
		StringBuilder ExpectedResult = new StringBuilder();
		for (int i = 0; i < stringOfTestingWord.length(); i++) {
			ExpectedResult.append("-");
		}
		assertEquals(ExpectedResult.toString(), MethodResult.toString());
	}

	@Test
	public void forWinnerchecker() {
		// It should Check If The String Has Any UnderScore
		String stringOfTestingWord = ("aword");
		boolean ExpectedResult;
		ExpectedResult = true;
		boolean MethodResult = object1.Winnerchecker(stringOfTestingWord);
		assertEquals(ExpectedResult, MethodResult);
	}

	@Test
	public void SecondforWinnerchecker() {
		// It should Check If The String Has Any UnderScore
		String stringOfTestingWord = ("neword");
		boolean ExpectedResult = true;
		boolean MethodResult = object1.Winnerchecker(stringOfTestingWord);
		assertEquals(ExpectedResult, MethodResult);
	}

	@Test
	public void forInputChecker() {
		// It should check if the input is a letter
		char charTest = 'c';
		boolean result = false;
		try {
			result = object1.inputChecker(charTest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean ExpectedResult = true;
		assertEquals(ExpectedResult, result);

	}

	@Test
	public void secindForInputChecker() {
		// It should check if the input is a letter
		char charTest = 'c';
		boolean result = false;
		try {
			result = object1.inputChecker(charTest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean ExpectedResult = true;
		assertEquals(ExpectedResult, result);

	}
}
