/*
* UCF COP 3330 Summer 2021 Assignment 3 Solution
* Copyright 2021 Charlene Creighton
*/

/*
Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt`
that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina
Constraint
Don't hard-code the number of names.
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution41 {
    // String which will take names from file
    private static String name;

    // Make sure file can be found
    public static void main(String[] args) throws FileNotFoundException {

        // Construct an object of ProcessFile type to call methods from that class
        ProcessFile call = new ProcessFile();

        // Create a file reader
        Scanner input = new Scanner(new File("exercise41_input.txt"));

        // Use a list of strings to take in the names
        List<String> names = new ArrayList<>();

        // Read items from file while file is not empty and add them to List of strings
        while (input.hasNext()) {
            name = input.nextLine();
            names.add(name);
        }

        // Call a function in another class that sorts the list
        call.toStringList(names);
    }
}
