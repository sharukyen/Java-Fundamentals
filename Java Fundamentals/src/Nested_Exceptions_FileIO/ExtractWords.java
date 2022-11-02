package Nested_Exceptions_FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 */

public class ExtractWords {
    public static int extractWords(String filename){
        Scanner fileInput = null;
        int count = 0;
        String word;
        char firstLetter;
        try {
            fileInput = new Scanner(new File(filename));
            while (fileInput.hasNext()) {
                word = fileInput.next();
                firstLetter = Character.toLowerCase(word.charAt(0));
                if (firstLetter == 'a' || firstLetter =='e' || firstLetter =='i' || firstLetter =='o'|| firstLetter =='u') {
                    count += 1;
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            System.out.printf("ERROR: The file '%s' does not exist.\n", filename);
        }
        finally {
            if (fileInput!= null)
                fileInput.close();
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(extractWords("summer.txt"));
    }
}
