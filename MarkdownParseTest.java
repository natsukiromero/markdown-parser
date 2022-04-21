import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    /**calls getLinks on test-file.md
     * assertequals [https://something.com, some-page.html] 
    */
    public void getLinksTester() throws IOException{
        String content = Files.readString(Path.of("test-file.md"));
        ArrayList<String> links = new ArrayList<String>();
        links.add("https://something.com");
        links.add("some-page.html");
        assertEquals(MarkdownParse.getLinks(content), links);
    }
}
