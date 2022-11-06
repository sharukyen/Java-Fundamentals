package Nested_Exceptions_FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *Define a static method named processMarks(String filename) which is passed two parameters:
 *
 * filename - the name of a text file containing a list of marks (one mark per student) which is to be read into the program,
 * course_name - the name of the course.
 * The input file contains a list of marks (whole numbers), one mark per line. The function reads the list of marks from the input file, processes the marks by calculating the total number of marks (the number of students in the class) and the average mark, and finally, prints a summary. For example, if the file, "Marks.txt" contains the following numbers:
 *
 * 79
 * 98
 * 50
 * 21
 * 48
 * 100
 * The following code:
 *
 * process_marks("Marks.txt", "CompSci 123")
 * produces the file with the following result:
 *
 * Compsci 123
 * Number of students: 6
 * Average mark: 66
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
