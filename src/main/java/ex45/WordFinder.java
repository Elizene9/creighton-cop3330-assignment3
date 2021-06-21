/*
 * UCF COP 3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Charlene Creighton
 */

/*
Given an input file named `exercise45_input.txt`, read the file and look for
all occurrences of the word utilize. Replace each occurrence with use.
Write the modified file to a new file.

Example Output
Given the input file of
One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".

The program should generate
One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".
Constraints
Prompt for the name of the output file.
Write the output to a new file.
 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFinder {

    // Create scanner for output file name
    static Scanner input = new Scanner(System.in);

    // Ensure file is found
    public static void main(String[] args) throws FileNotFoundException {

        // Prompt for output file name
        System.out.println("What is the name of the file?");
        String fileName = input.next();

        // Create output file
        PrintWriter callFile = new PrintWriter(fileName);

        // Create Object of class which will generate updated text
        GenerateText call = new GenerateText();

        // Open file to read by creating reader
        Scanner fileCall = new Scanner(new File("exercise45_input.txt"));

        // Create list of strings
        List<String> text = new ArrayList<>();

        // Scan file strings into list of strings while file has strings
        while (fileCall.hasNext())
            text.add(fileCall.next());

        // Print to output file
        callFile.print(call.fileText(call.newList(text)));

        // Close files
        callFile.close();
        fileCall.close();

    }
}
