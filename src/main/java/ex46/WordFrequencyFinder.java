/*
 * UCF COP 3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Charlene Creighton
 */

/*
Create a program that reads in a file named `exercise46_input.txt` and counts
the frequency of words in the file. Then construct a histogram displaying
the words and the frequency, and display the histogram to the screen.

Example Output
Given the text file `exercise46_input.txt` with this content

badger badger badger
badger mushroom
mushroom snake badger badger
badger
the program would produce the following output:

badger:   *******
mushroom: **
snake:    *
Constraint
Ensure that the most used word is at the top of the report and the least used words are at the bottom.
 */

package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFrequencyFinder {

    // Handle file not found exceptions
    public static void main(String[] args) throws FileNotFoundException {

        // Create fileReader to read file
        Scanner fileCall = new Scanner(new File("exercise46_input.txt"));

        // Stars assorted into one string
        String newWord;

        // Create object of class which will traverse data from file
        SortData call = new SortData();

        // Create list of strings to take contents of file
        List<String> data = new ArrayList<>();

        // Read contents of file into list while list is not empty
        while (fileCall.hasNext())
            data.add(fileCall.next());

        // Call methods of class to process data and print it
        newWord = call.differentWords(call.sortList(data));
        System.out.println(newWord);

        // Close input file
        fileCall.close();

    }
}
