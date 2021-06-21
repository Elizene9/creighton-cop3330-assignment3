package ex42;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormatListTest {

    @Test
    void FormatterReturnsCorrectDataProvidedFromInputFile() {

        FormatList call = new FormatList();

        int i = 0;
        List<String> lnames = new ArrayList<>();
        List<String> fnames = new ArrayList<>();
        List<String> Salary = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();

        String[] last = {"Ling, Johnson, Jones, Jones, Swift, Xiong, Zarnecki"};
        String[] first = {"Mai", "Jim", "Aaron", "Chris", "Geoffrey", "Fong", "Sabrina"};
        String[] salary = {"55900", "56500", "46000", "34500", "14200", "65000", "51500"};

        for (i = 0; i < last.length; i++)
            lnames.add(last[i]);

        for (i = 0; i < first.length; i++)
            fnames.add(first[i]);

        for (i = 0; i < salary.length; i++)
            Salary.add(salary[i]);

        list.add(lnames);
        list.add(fnames);
        list.add(Salary);

        for (int j = 0; j < list.size(); j++) {

            assertEquals(list.get(j), call.formatter(lnames, fnames, Salary).get(j));
        }

    }

    @Test
    void FormatterReturnsCorrectSizedList() {

        FormatList call = new FormatList();

        int i = 0;
        List<String> lnames = new ArrayList<>();
        List<String> fnames = new ArrayList<>();
        List<String> Salary = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();

        String[] last = {"Ling, Johnson, Jones, Jones, Swift, Xiong, Zarnecki"};
        String[] first = {"Mai", "Jim", "Aaron", "Chris", "Geoffrey", "Fong", "Sabrina"};
        String[] salary = {"55900", "56500", "46000", "34500", "14200", "65000", "51500"};

        for (i = 0; i < last.length; i++)
            lnames.add(last[i]);

        for (i = 0; i < first.length; i++)
            fnames.add(first[i]);

        for (i = 0; i < salary.length; i++)
            Salary.add(salary[i]);

        list.add(lnames);
        list.add(fnames);
        list.add(Salary);

        assertEquals(list.size(), call.formatter(lnames, fnames, Salary).size());


    }
}