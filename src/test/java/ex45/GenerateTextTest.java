package ex45;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GenerateTextTest {

    @Test
    void CorrectListReturnedFromInputFiles() throws FileNotFoundException {

        GenerateText call = new GenerateText();

        List<String> list = new ArrayList<>();
        List<String> newList;
        List<String> correctList = new ArrayList<>();

        Scanner fileCall = new Scanner(new File("exercise45_input.txt"));
        Scanner fileCall2 = new Scanner(new File("exercise45Test_input.txt"));

        while (fileCall.hasNext())
            list.add(fileCall.next());

        while (fileCall2.hasNext())
            correctList.add(fileCall2.next());

        newList = call.newList(list);

        for (int i = 0; i < newList.size(); i++) {
            assertEquals(correctList.get(i), newList.get(i));
        }
    }

    @Test
    void CorrectStringIsReturnedFromInputFile() throws FileNotFoundException {

        GenerateText call = new GenerateText();

        List<String> list = new ArrayList<>();

        String New;
        String Original = "One should never use the word \"use\" in writing." +
                " Use \"use\" instead. For example, \"She uses an IDE to write her Java programs\"" +
                " instead of \"She uses an IDE to write her Java programs\"."
        ;
        Scanner fileCall = new Scanner(new File("exercise45Test_input.txt"));

        while (fileCall.hasNext())
            list.add(fileCall.next());

        New = call.fileText(list);

        assertEquals(Original, New);
    }
}