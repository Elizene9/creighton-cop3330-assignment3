/*
 * UCF COP 3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Charlene Creighton
 */

package ex42;

import java.util.ArrayList;
import java.util.List;

public class FormatList {

    // Take in lists of all data and return them as one
    public List<List<String>> formatter (List<String> lnames, List<String> fnames, List<String> salaries) {

        // Create list of all items to return
        List<List<String>> list= new ArrayList<>();

        // Create String arrays with last names, first names, and salaries to take info from lists
        String[] lname;
        String[] fname;
        String[] salary;

        // Give arrays size of respective lists
        lname = new String[lnames.size()];
        fname = new String[fnames.size()];
        salary = new String[salaries.size()];

        // Assign arrays list data
        for (int i = 0; i < lnames.size(); i++) {

            lname[i] = lnames.get(i);
            fname[i] = fnames.get(i);
            salary[i] = salaries.get(i);

        }

        // Initial print
        System.out.println("   Last        First        Salary");
        System.out.println("   -------------------------------");

        // Print data
        for (int j = 0; j < lname.length; j++)
            System.out.format("%10s %11s %11s\n", lname[j], fname[j], salary[j]);

        // Add items to return list
        list.add(lnames);
        list.add(fnames);
        list.add(salaries);

        return list;
    }
}
