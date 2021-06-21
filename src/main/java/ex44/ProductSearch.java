/*
 * UCF COP 3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Charlene Creighton
 */

/*
Create a program that takes a product name as input and retrieves the current price and
quantity for that product. The product data is in a data file in the JSON format
and looks like this (you will create this file as `exercise44_input.json`):
{
    "products" : [
        {"name": "Widget", "price": 25.00, "quantity": 5 },
        {"name": "Thing", "price": 15.00, "quantity": 5 },
        {"name": "Doodad", "price": 5.00, "quantity": 10 }
    ]
}
Print out the product name, price, and quantity if the product is found.
If no product matches the search, state that no product was found and start over.

Example Output
What is the product name? iPad
Sorry, that product was not found in our inventory.
What is the product name? Galaxy
Sorry, that product was not found in our inventory.
What is the product name? Thing
Name: Thing
Price: 15.00
Quantity: 5
Constraints
The file is in the JSON format. Use a JSON parser to pull the values out of the file
(e.g. https://github.com/google/gson (Links to an external site.)).
If no record is found, prompt again.
 */

package ex44;

import java.io.File;
import java.util.*;

public class ProductSearch {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)throws Exception{

        // Object of type ProcessData
        ProcessData call = new ProcessData();

        // Create list to take info
        List<String> list = new ArrayList();

        // Declare variable strings
        String[] names = {"Widget", "Thing", "Doodad"};
        String[] quantity = {"5", "5", "10"};
        String[] prices = {"25.00", "15.00", "5.00"};
        String[] complete = new String[3];

        // Add elements to list
        for (int i = 0; i < 3; i++) {

            list.add(names[i]);
            list.add(prices[i]);
            list.add(quantity[i]);
        }

        String userSearch;
        System.out.print("What is the product name? ");
        userSearch = input.next();
        while (!list.contains(userSearch)) {
            System.out.println("Sorry that product was not found in our inventory");
            System.out.print("What is the product name? ");
            userSearch = input.next();
        }

        complete = call.traverseFile(list, userSearch);
    }

}
