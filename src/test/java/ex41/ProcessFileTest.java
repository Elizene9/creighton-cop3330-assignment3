package ex41;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessFileTest {

    @Test
    void ListIsSortedCorrectly() throws FileNotFoundException {

        // Create object to call ProcessFile methods
        ProcessFile call = new ProcessFile();

        // Create new arrays to see if they match once sorted
        String[] sorted;
        String[] unsorted;

        sorted = new String[]{"Johnson, Jim", "Jones, Aaron", "Jones, Chris",
        "Ling, Mai", "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina"};

        unsorted = new String[]{"Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
                "Jones, Chris","Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"};

        // Sort unsorted String array
        call.printOutputFile(unsorted);

        // Check if unsorted file is sorted correctly
        for (int i = 0; i < sorted.length; i++)
            assertEquals(sorted[i], unsorted[i]);
    }

}