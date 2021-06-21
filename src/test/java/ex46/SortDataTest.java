package ex46;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SortDataTest {

    @Test
    void ListIsCorrectlySortedIntoStringArray() throws FileNotFoundException {

        SortData call = new SortData();
        List<String> list = new ArrayList<>();

        Scanner fileCall = new Scanner(new File("exercise46_input.txt"));
        while (fileCall.hasNext())
            list.add(fileCall.next());

        String[] words = new String[list.size()];

        for (int i = 0; i < words.length; i++) {
            words[i] = list.get(i);
        }

        Arrays.sort(words);

        for (int j = 0; j < words.length; j++) {
            assertEquals(words[j], call.sortList(list)[j]);
        }

    }

    @Test
    void differentWordsReturnsCorrectString() throws FileNotFoundException {

        SortData call = new SortData();
        String[] words = new String[10];
        Scanner fileCall = new Scanner(new File("exercise46_input.txt"));
        for (int i = 0; i < 10; i++) {

            words[i] = fileCall.next();
        }

        Arrays.sort(words);

        String correct = """
                badger: *******
                mushroom: **
                snake: *
                """;

        assertEquals(correct, call.differentWords(words));
    }

    @Test
    void starsUsesFrequencyToProduceCorrectStringOfStars() {

        SortData call = new SortData();

        String[] words = {"badger", "mushroom", "snake"};
        int[] count = {7, 2, 1 };

        String found = call.stars(words, count);
        String correct = """
                badger: *******
                mushroom: **
                snake: *
                """;

        assertEquals(correct, found);
    }
}