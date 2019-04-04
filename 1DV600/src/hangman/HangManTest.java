package hangman;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HangManTest {

	HangmanMethods sut;

	@BeforeEach
	void startB() {
		sut = new HangmanMethods();
		
	}
	   @Test
	    public void shouldReturnTrueIfTheLetterIsInTheWordAtCertainPosition () {
	        //test-input-output definitions
	        String[] inputWord = {"h", "e", "l", "l", "o"};
	        String inputLetter = "o";
	        int inputposition = 4;
	        boolean ExpectedResult = true;

	        //exercice the sut
	        //boolean MethodResult = sut.isLetterinWord(inputLetter, inputposition, inputWord);

	        //compare actual result with the expected value and report
	       // assertEquals(ExpectedResult,MethodResult);
	   }
}
