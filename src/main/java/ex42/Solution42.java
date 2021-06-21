/*
 * UCF COP 3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Charlene Creighton
 */

/*
Construct a program that reads in the following data file
(you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table,
evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

Constraints
Write your own code to parse the data. Don't use a CSV parser.
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

public class Solution42 {

    // Create main and ensure file is found and can be read
    public static void main(String[] args) throws FileNotFoundException {

        // Object to call methods of FormatList Class
        FormatList call = new FormatList();

        // Declare list of strings to hold info
        List<String> lname = new ArrayList<>();
        List<String> fname = new ArrayList<>();
        List<String> salary = new ArrayList<>();

        // Create file scanner
        Scanner fileCall = new Scanner(new File("exercise42_input.txt"));

        // Read entire file and split where commas are found
        while (fileCall.hasNext()) {

            String[] data = fileCall.nextLine().split(",");
            lname.add(data[0]);
            fname.add(data[1]);
            salary.add(data[2]);

        }

        // Call formatter method and close file
        call.formatter(lname, fname, salary);
        fileCall.close();

    }
}
