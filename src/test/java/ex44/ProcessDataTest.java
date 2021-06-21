package ex44;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessDataTest {

    @Test
    void traverseFileReturnsCorrectStringArray() {

        List<String> list = new ArrayList<>();
        String[] names = {"Widget", "Thing", "Doodad"};
        String[] quantity = {"5", "5", "10"};
        String[] prices = {"25.00", "15.00", "5.00"};
        String[] correct = {"Widget", "25.00", "5"};
        for (int i = 0; i < 3; i++) {
            list.add(names[i]);
            list.add(prices[i]);
            list.add(quantity[i]);
        }
        ProcessData call = new ProcessData();

        String[] check = new String[3];
        check = call.traverseFile(list, "Widget");

        for (int i = 0; i < 3; i++) {

            assertEquals(correct[i], check[i]);
        }

    }
}