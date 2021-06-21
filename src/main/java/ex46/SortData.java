/*
 * UCF COP 3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Charlene Creighton
 */

package ex46;

import java.util.Arrays;
import java.util.*;
import java.util.List;

// Takes in all values in input file and sorts and prints accordingly
public class SortData {

    // Sorts list of strings as array of strings
    public String[] sortList(List<String> data) {

        // Create array of strings to take list data
        String[] words = new String[data.size()];

        // Assign String array the values of list
        for (int i = 0; i < words.length; i++)
            words[i] = data.get(i);

        // Sort array
        Arrays.sort(words);

        return words;
    }

    public String differentWords(String[] allWords) {

        // Different words counters
        int a = 0, b = 0;
        int[] counter = new int[allWords.length];

        // Create string to only receive one of each different word
        String[] differentWords;

        // Counter array takes in index of each different value using while loop
        counter[0] = a;

        // Loop counting how many different words occur (using sorted array so no repetition occurs)
        for (a = 1; a < allWords.length; a++) {

            if (a != allWords.length - 1)
                if (!allWords[a].equals(allWords[a + 1])) {
                b++;
                counter[b] = a + 1;
                }
        }

        // Give String array size of how many different words there are
        differentWords = new String[b+1];
        int[] freqCounter = new int[b+1];

        // Give one of each different word to new String array and count number of times each word occurs
        for (int d = 0; d < (b+1); d++) {
            freqCounter[d] = 0;
            differentWords[d] = allWords[counter[d]];

            for (String allWord : allWords) {

                if (differentWords[d].equals(allWord))
                    freqCounter[d]++;
            }
        }

        // Call stars function to print stars according to frequency
        return stars(differentWords, freqCounter);
    }

    // Create string of stars according to how many times each word occurs
    public String stars(String[] words, int[] counter) {

        // String array taking in values assigned by sorted map
        String[] newOrder = new String[words.length];

        // return string of stars
        StringBuilder finalString = new StringBuilder();

        // Map sorting values by key
        TreeMap<Integer, String> map = new TreeMap<>();

        // Put values into map according to key value
        for(int i = 0; i < words.length; i++) {

            map.put(counter[i], words[i]);

        }

        // Give map values to string array
        for(int j = 0; j < words.length; j++)
            newOrder[j] = map.get(counter[j]);

        // Assign stars according to frequency of each word
        for (int k = 0; k < words.length; k++) {

            finalString.append(newOrder[k]);
            finalString.append(": ");
            finalString.append("*".repeat(Math.max(0, counter[k])));

            finalString.append("\n");
        }

        return finalString.toString();
    }
}
