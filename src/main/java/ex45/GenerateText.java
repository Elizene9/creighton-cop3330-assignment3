/*
 * UCF COP 3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Charlene Creighton
 */

package ex45;

import java.util.List;

// This class uses methods to generate output file text
public class GenerateText {

    // Method that takes in list of strings and generates new list of strings
    public List<String> newList(List<String> text) {

        // Convert text "utilize" to "use"
        for (int i = 0; i < text.size(); i++) {

            switch (text.get(i)) {
                case "utilize" -> text.set(i, "use");
                case "utilizes" -> text.set(i, "uses");
                case "\"utilize\"" -> text.set(i, "\"use\"");
                case "\"utilizes\"" -> text.set(i, "\"uses\"");
            }
        }

        return text;
    }

    // Method to print to output list of strings to file
    public String fileText (List<String> text) {

        // Create single string of output data to print to file
        StringBuilder totalText;

        // Add each member of list to string
        totalText = new StringBuilder(text.get(0));

        for (int i = 1; i < text.size(); i++)

            totalText.append(" ").append(text.get(i));

        // Return appended string
        return totalText.toString();
    }
}
