package ex44;

import java.util.List;

public class ProcessData {

    String[] traverseFile (List<String> list, String userSearch) {

        // Create return array
        String[] objects;

        int check = 0;

        // Check if user search is in list
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(userSearch))
                check = i;
        }

        // print what is available
        System.out.printf("\nName: %s\nPrice: %s\nQuantity: %s", list.get(check), list.get(check + 1), list.get(check + 2));

        objects = new String[]{list.get(check), list.get(check + 1), list.get(check + 2)};
        return objects;
    }
}
