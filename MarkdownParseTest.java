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
    /**made with vimtutor */
    public void subtraction(){
	    assertEquals(1, 2 - 1);
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

    @Test
    /**tests test-file2.md*/
    public void testFile2Tester() throws IOException{
        String content = Files.readString(Path.of("test-file2.md"));
        ArrayList<String> links = new ArrayList<String>();
        links.add("https://something.com");
        links.add("some-page.html");
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests test-file3.md*/
    public void testFile3Tester() throws IOException{
        String content = Files.readString(Path.of("test-file3.md"));
        ArrayList<String> links = new ArrayList<String>();
        assertEquals(MarkdownParse.getLinks(content), links);
    }
    
    @Test
    /**tests test-file4.md*/
    public void testFile4Tester() throws IOException{
        String content = Files.readString(Path.of("test-file4.md"));
        ArrayList<String> links = new ArrayList<String>();
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests test-file5.md*/
    public void testFile5Tester() throws IOException{
        String content = Files.readString(Path.of("test-file5.md"));
        ArrayList<String> links = new ArrayList<String>();
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests test-file6.md*/
    public void testFile6Tester() throws IOException{
        String content = Files.readString(Path.of("test-file6.md"));
        ArrayList<String> links = new ArrayList<String>();
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests test-file7.md*/
    public void testFile7Tester() throws IOException{
        String content = Files.readString(Path.of("test-file7.md"));
        ArrayList<String> links = new ArrayList<String>();
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests test-file8.md*/
    public void testFile8Tester() throws IOException{
        String content = Files.readString(Path.of("test-file8.md"));
        ArrayList<String> links = new ArrayList<String>();
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests lab5-testing.md*/
    public void testLab5Testing() throws IOException{
        String content = Files.readString(Path.of("lab5-testing.md"));
        ArrayList<String> links = new ArrayList<String>();
        links.add("https://something.com");
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests snippet 1 for lab report 4*/
    public void testSnippet1() throws IOException{
        String content = Files.readString(Path.of("snippet1.md"));
        ArrayList<String> links = new ArrayList<String>();
        links.add("`google.com");
        links.add("google.com");
        links.add("ucsd.edu");
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests snippet 2 for lab report 4*/
    public void testSnippet2() throws IOException{
        String content = Files.readString(Path.of("snippet2.md"));
        ArrayList<String> links = new ArrayList<String>();
        links.add("a.com");
        links.add("a.com(())");
        links.add("example.com");
        assertEquals(MarkdownParse.getLinks(content), links);
    }

    @Test
    /**tests snippet 3 for lab report 4*/
    public void testSnippet3() throws IOException{
        String content = Files.readString(Path.of("snippet3.md"));
        ArrayList<String> links = new ArrayList<String>();
        links.add("https://www.twitter.com");
        links.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        links.add("https://cse.ucsd.edu/");
        assertEquals(MarkdownParse.getLinks(content), links);
    }
}
