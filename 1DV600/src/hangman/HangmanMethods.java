package hangman;

import java.util.Random;
import java.util.Scanner;

public class HangmanMethods {
	public static String theWord;
	public static StringBuilder someLines;
	public static int[] positions;
	public static String[] Word = { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antarctica",
			"Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahrain", "Bangladesh", "Barbados",
			"Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia"

	};

	public static String ChosingWord() {
		Random rand = new Random();
		int TW = rand.nextInt(23);
		String theChosen = Word[TW];
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

	public static void main(String[] args) {
		String tst = ChosingWord();
		System.out.println(tst);
		System.out.println(theLine(tst).toString());
		System.out.println("please provide a letter or word!");
		System.out.println(theLine(tst));
		StringBuilder sb = theLine(tst);
		for (int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			String guess = scan.next();
			for (int j = 0; j < guess.length(); j++) {
				char pol = guess.charAt(j);
				checkerPositins(pol);

				for (int k = 0; k < theWord.length(); k++) {
					if (pol == theWord.charAt(k)) {
						sb.setCharAt(k, pol);
					}
				}
				System.out.print(sb.toString() + "\n");
			}

		}			
	

		
		if (Winnerchecker(sb.toString()) == true)
			System.out.println("Awesome, you are a winner!");
		else {
			System.out.println("Awww, you lost ): The word was: " +theWord );}
	}
	
}
