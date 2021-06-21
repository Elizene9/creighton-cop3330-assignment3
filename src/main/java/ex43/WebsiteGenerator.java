/*
* UCF COP 3330 Summer 2021 Assignment 3 Solution
* Copyright 2021 Charlene Creighton
 */

/*
Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag
and the author in a <meta> tag.
Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.
 */

package ex43;

import java.io.*;
import java.util.Scanner;

public class WebsiteGenerator {

    // Declare static variables
    private static String sitename;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // Create object of class CreateFiles
        CreateFiles call = new CreateFiles();

        // Prompt user for info
        System.out.print("Site name: ");
        sitename = input.nextLine();

        System.out.print("Author: ");
        String author = input.nextLine();

        // Prompt user for whether they desire Javascript file folder
        System.out.print("\nDo you want a folder for JavaScript files? ");
        char ans1 = input.next().charAt(0);

        // Prompt user for whether they desire css file folder
        System.out.print("\nDo you want a folder for css files? ");
        char ans2 = input.next().charAt(0);

        // Call methods of CreateFiles class to print output
        System.out.println(call.html(sitename, author));
        System.out.println(call.js(sitename, ans1));
        System.out.println(call.css(sitename, ans2));
    }
}
