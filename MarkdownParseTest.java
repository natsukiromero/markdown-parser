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
     * assertequals [https://something.com, some-thing.html] 
    */
    public void testFileTester() throws IOException{
        String content = Files.readString(Path.of("test-file.md"));
        ArrayList<String> links = new ArrayList<String>();
        links.add("https://something.com");
        links.add("some-thing.html");
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests new-file.md*/
    public void newFileTester() throws IOException{
        String content = Files.readString(Path.of("new-file.md"));
        ArrayList<String> links = new ArrayList<String>();
        links.add("test-file.md");
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests other-file.md */
    public void otherFileTester() throws IOException{
        String content = Files.readString(Path.of("other-file.md"));
        ArrayList<String> links = new ArrayList<String>();
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests another-file.md*/
    public void anotherFileTester() throws IOException{
        String content = Files.readString(Path.of("another-file.md"));
        ArrayList<String> links = new ArrayList<String>();
        assertEquals(MarkdownParse.getLinks(content), links);
    }
}
