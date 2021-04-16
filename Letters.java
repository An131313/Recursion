package sets;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Letters {
	public static void main(String[] args) throws Exception {
		File file = new File("LettersFile.txt");

		Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
		int vowels = 0; 
		int consonants = 0; 

		// Count the number of vowels and consonants 
		try ( 
			Scanner inputFile = new Scanner(file); 
		) {
			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				for (int i = 0; i < line.length(); i++) {
					if (set.contains(Character.toUpperCase(line.charAt(i))))
						vowels++;
					else if (Character.isLetter(line.charAt(i)))
						consonants++;
				}
			}
		}

		System.out.println("The file LettersFile has " + vowels + 
			" vowels and " + consonants + " consonants.");
	}
}
