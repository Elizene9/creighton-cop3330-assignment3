package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// This class uses methods to create all files desired by user
public class CreateFiles {

    public String html (String sitename, String author) throws IOException {

        // Create html file and file writer
        File callFile = new File("index.html");
        BufferedWriter x = new BufferedWriter(new FileWriter(callFile));

        // Write new user info into html file using html syntax
        String htmlText =
                "<html>\n   <head>\n      <meta author = \"" + author + "" +
                        "\">\n     <title>" + sitename + "</title>\n   </head>" +
                        "\n</html>";

        if (callFile.exists())
            x.write(htmlText);

        // Show files created, close file, and return files created
        String stmt = "Created ./website/" + sitename;
        stmt += "\nCreated ./website/" + sitename + "/" + callFile.getName();

        x.close();

        return stmt;
    }

    public String css (String Sitename, char ans) {

        // Create new directory if user desires css file folder and return created folder
        if (ans == 'y' || ans =='Y') {
            File cssFile = new File("file.css");
            cssFile.mkdir();
            return "Created ./website/" + Sitename + "/css/";
        }
        // Return nothing
        else
            return "";
    }

    public String js (String Sitename, char ans) {

        // Create new directory if user desires JS file folder and return created folder
        if (ans == 'y' || ans =='Y') {
            File JsFile = new File("file.js");
            JsFile.mkdir();
            return "Created ./website/" + Sitename + "/js/";
        }
        // Return nothing
        else
            return "";
    }
}
