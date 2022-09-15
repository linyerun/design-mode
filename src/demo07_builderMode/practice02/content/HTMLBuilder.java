package demo07_builderMode.practice02.content;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

    private String filename;
    private PrintWriter writer;//用于编写文件的PrintWriter

    @Override
    public void buildTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter("src/demo07_builderMode/practice02/resources/"+filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>"+title+"</title><meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"utf-8\"></head><body>");
        writer.println("<h1>"+title+"</h1>");//输出标题
    }

    @Override
    public void buildString(String str) {
        writer.println("<p>"+str+"</p>");
    }

    @Override
    public void buildItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void buildDone() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
