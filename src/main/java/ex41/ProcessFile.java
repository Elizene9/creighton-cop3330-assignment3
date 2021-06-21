/*
 * UCF COP 3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Charlene Creighton
 */

package ex41;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class ProcessFile {

    // Create String array and output file
    private String[] names;

    private final PrintWriter callFile = new PrintWriter("excercise41_ouput.txt");

    // Handle file issues
    public ProcessFile() throws FileNotFoundException {
    }

    // This method converts list to array of strings and calls other method to write list to output file
    void toStringList(List<String> original) {

        // Assign String array size of list
        names = new String[original.size()];

        // Assign names array values of list
        for (int i = 0; i < original.size(); i++)
             names[i] = original.get(i);

        // Call method to print to output file
        printOutputFile(names);
    }

    // sorts array and prints to output file
    void printOutputFile (String[] names) {

        Arrays.sort(names);
        // Print initial statement to output file
        callFile.printf("Total of %d names\n-----------------\n", names.length);

        // print sorted list to output file and close the file
        for (String name : names)
            callFile.println(name);

        // close file
        callFile.close();
    }

}
