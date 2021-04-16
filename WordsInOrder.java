package seven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WordsInOrder {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		
		File fileRead = new File("textFile.txt");
		
		try {
			Scanner read = new Scanner(fileRead);
			while (read.hasNextLine()) {
				String line = read.nextLine();
				//System.out.println(line);
				String lineWords[] = line.split(" "); 
				words.addAll(Arrays.asList(lineWords));
			}
		    read.close();
		} catch (FileNotFoundException e) {
			try {
				fileRead.createNewFile();
			} catch (IOException el) {
				el.printStackTrace();
			}
		}
		
		Collections.sort(words);
		System.out.println(words);
		
	}

}
