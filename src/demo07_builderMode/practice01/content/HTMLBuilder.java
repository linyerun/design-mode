package demo07_builderMode.practice01.content;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder {

    private String filename;
    private PrintWriter writer;//用于编写文件的PrintWriter

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            //TODO 这里有个bug，无论怎么改这个路径都输出到"src/demo07_builderMode/demo/resources/"+filename
            //原来是Main函数导包把demo包下的导进来了。
            writer = new PrintWriter(new FileWriter("src/demo07_builderMode/practice01/resources/"+filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>"+title+"</title><meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"utf-8\"></head><body>");
        writer.println("<h1>"+title+"</h1>");//输出标题
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>"+str+"</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
