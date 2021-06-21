package ex43;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CreateFilesTest {

    @Test
    void htmlFileReturnsCorrectStringBasedOnUserInput() throws IOException {

        CreateFiles call = new CreateFiles();

        String Statement = call.html("awesomeco", "Ralph");

        String actual ="Created ./website/awesomeco\n" +
                "Created ./website/awesomeco/index.html";
        assertEquals(actual, Statement);
    }

    @Test
    void JsReturnsCorrectStringBecauseDirectoryIsCreatedProperly() {

        CreateFiles call = new CreateFiles();

        String Statement = call.js("awesomeco", 'y');

        String actual = "Created ./website/awesomeco/js/";

        assertEquals(actual, Statement);
    }

    @Test
    void CssReturnsCorrectStringBecauseDirectoryIsCreatedProperly() {

        CreateFiles call = new CreateFiles();

        String Statement = call.css("awesomeco", 'y');

        String actual = "Created ./website/awesomeco/css/";

        assertEquals(actual, Statement);
    }
}