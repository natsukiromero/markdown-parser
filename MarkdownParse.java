//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarkdownParse {

    public static ArrayList<String> getLinks(List<String> markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        for(String line: markdown) {
            int currentIndex = 0;
            while(currentIndex < line.length()) {
                int openBracket = line.indexOf("[", currentIndex);
                int closeBracket = line.indexOf("]", openBracket);
                int openParen = line.indexOf("(", closeBracket);
                int closeParen = line.indexOf(")", openParen);
                toReturn.add(line.substring(openParen + 1, closeParen));
                currentIndex = closeParen + 1;
            }
            
        }
        return toReturn;
    }


    public static void main(String[] args) throws Exception {
        Path fileName = Path.of(args[0]);
        List<String> lines = Files.readAllLines(fileName);
        for(String line: lines) {
            if(line.contains("[") == false) {
            //if(line.isEmpty()){
                lines.remove(line);
            }
        }
        //only works if <br> included in md
        /*for(int i =0; i<lines.size();i++) {
            System.out.println(lines.get(i));
        }*/
        //ArrayList<String> links = getLinks(lines);
	    //System.out.println(links);
    }
}
