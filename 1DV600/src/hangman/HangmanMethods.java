package hangman;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HangmanMethods {
	public static String theWord;
	public static StringBuilder someLines;
	public static int[] positions;
	public static String[] WordsForHangMan = { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antarctica",
			"Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahrain", "Bangladesh", "Barbados",
			"Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia"

	};

	public static String ChosingWord() {
		Random rand = new Random();
		int TW = rand.nextInt(23);
		String theChosen = WordsForHangMan[TW];
		return theWord = theChosen.toLowerCase();
	}

	public static StringBuilder theLine(String str) {
		StringBuilder lines = new StringBuilder();
		for (int i = 0; i < str.length(); i++)
			lines.append("-");
		return someLines = lines;

	}

	public static boolean Winnerchecker(String str) {
		if (str.contains("-"))
			return false;
		return true;
	}

	public static int[] checkerPositins(char str) {
		int[] numberOfPositins = new int[theWord.length()];
		for (int i = 0; i < theWord.length(); i++)
			if (str == theWord.charAt(i))
				numberOfPositins[i] = theWord.indexOf(str);
		return positions = numberOfPositins;

	}
	public static boolean inputChecker (char str) throws IOException
	{
		if (!(Character.isLetter(str)))
		{
			System.out.println("The character is not a letter or word! ");
			throw new IOException();

		}
		return true;
		
	}

	public static void main(String[] args) throws IOException {
		String tst = ChosingWord();
		System.out.println(tst);
		System.out.println(theLine(tst).toString());
		System.out.println("please provide a letter or word!");
		System.out.println(theLine(tst));
		StringBuilder sb = theLine(tst);
		for (int i = 0; i < 6; i++) {
			Scanner scan = new Scanner(System.in);
			String guess = scan.next();
			for (int j = 0; j < guess.length(); j++) {
				char pol = guess.charAt(j);
				checkerPositins(pol);

				for (int k = 0; k < theWord.length(); k++) {
					if (pol == theWord.charAt(k)) {
						if (inputChecker(pol)==true)
						sb.setCharAt(k, pol);
						i--;
					}
				}
				System.out.print(sb.toString() + "\n" );
				System.out.println("The number of guesses left: " +(6-(i+1)));
			}

		}

		if (Winnerchecker(sb.toString()) == true)
			System.out.println("Awesome, you are a winner!");
		else {
			System.out.println("Awww, you lost ): The word was: " + theWord);
		}
	}

}
