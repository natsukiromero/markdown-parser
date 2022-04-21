import static org.junit.Assert.*;
import org.junit.*;

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
        //assertEquals(MarkdownParse.main(testFile).links, expected);
    }
}
