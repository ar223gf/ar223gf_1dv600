/**
 * 
 */
package hangman;

import static org.junit.jupiter.api.Assertions.*;
import hangman.HangmanMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HangmanMethodsTest2 
{

	HangmanMethods object1;
	public static String theWord;
	public static int[] positions;

	@BeforeEach
	void startB() {

	}

	@Test
	public void fortheLine() {
		//It should Create An StringBuilder Of UnderScores
		String stringOfTestingWord = ("AWord");
		StringBuilder MethodResult = object1.theLine(stringOfTestingWord);
		StringBuilder ExpectedResult = null;
		ExpectedResult.append("-----");
		assertEquals(ExpectedResult, MethodResult);
	}

	@Test
	public void forWinnerchecker() {
		//It should Check If The String Has Any UnderScore
		String stringOfTestingWord = ("AWord");
		boolean ExpectedResult = false;
		boolean MethodResult = object1.Winnerchecker(stringOfTestingWord);
		assertEquals(ExpectedResult, MethodResult);
	}

	@Test
	public void forChosingWord()
	{
		//It Should Return A Word Within MyWords
		boolean resultSecond = (Boolean) null;
		theWord = object1.ChosingWord();
		for (int i = 0; i<object1.WordsForHangMan.length;i++)
			if(object1.WordsForHangMan[i].equals(theWord)==true)
			{
				resultSecond = true;
			}
		boolean ExpectedResult = true;
		assertEquals(ExpectedResult, resultSecond);

	}
	
	@Test
	public void forcheckerPositins()
	{
		//It should return an Array contain the index number of the first and other character of the input entered by the player
		char charTest = theWord.charAt(0);
		int[] arrayTest = object1.checkerPositins(charTest);
		
		

	}

}
