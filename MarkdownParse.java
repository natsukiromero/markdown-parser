//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
//https://github.com/BellaReal/markdown-parser/blob/main/MarkdownParse.java

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        Scanner scnr = new Scanner(markdown);
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(scnr.hasNextLine()) { 
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);

            // to handle case where one of them loops over the file again
            if (openBracket < 0 || closeBracket < 0 || openParen < 0 || closeParen < 0) {
                break;
            }

            //check that link is a valid link
            String link = markdown.substring(openParen + 1, closeParen);
            if(link.contains(" ") == false) {
                toReturn.add(link);
            }
            currentIndex = closeParen + 1;
            scnr.nextLine();
        }
        scnr.close();

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}