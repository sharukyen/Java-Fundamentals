package Nested_Exceptions_FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 */

public class ProcessMarks {
    public static void processMarks(String filename, String course) {
        Scanner fileInput = null;
        int count = 0, total = 0;
        try {
            fileInput = new Scanner(new File(filename));
            while (fileInput.hasNextInt()) {
                total += fileInput.nextInt();
                count += 1;
            }
        } catch (IOException e) {
            System.out.printf("ERROR: The file '%s' does not exist.\n", filename);
        } finally {
            if (fileInput != null) {
                fileInput.close();
                System.out.println(course);
                System.out.printf("Number of students: %d\n", count);
                double avg = (double) total / count;
                System.out.printf("Average mark: %.0f", avg);
            }
        }
    }


    public static void main(String[] args){
            processMarks("Marks.txt", "Compsci123");


    }
}
