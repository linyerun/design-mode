package demo07_builderMode.practice03.content;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class XMLBuilder extends Builder {

    private String filename;
    private PrintWriter print;

    @Override
    protected void buildTitle(String title) {
        filename = title + ".xml";
        try {
            print = new PrintWriter(new FileWriter("src/demo07_builderMode/practice03/resources/"+filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        print.println("<letter>");
        print.println("\t<title>"+title+"</title>");
    }

    @Override
    protected void buildString(String str) {
        print.println("\t<string>"+str+"</string>");
    }

    @Override
    protected void buildItems(String[] items) {
        print.println("\t<items>");
        for (String item : items) {
            print.println("\t\t<item>"+item+"</item>");
        }
        print.println("\t</items>");
    }

    @Override
    protected void buildDone() {
        print.println("</letter>");
        print.close();
    }

    public String getFilename() {
        return filename;
    }
}
