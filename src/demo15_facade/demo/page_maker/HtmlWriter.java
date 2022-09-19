package demo15_facade.demo.page_maker;

import java.io.IOException;
import java.io.Writer;

//完成P1要求=>删除public
class HtmlWriter {

    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {    // 输出标题
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title><meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"utf-8\">");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    public void paragraph(String msg) throws IOException {  // 输出段落
        writer.write("<p>" + msg + "</p>\n");
    }

    public void link(String href, String caption) throws IOException {  // 输出超链接
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailAddr, String username) throws IOException {   //  输出邮件地址
        link("mailto:" + mailAddr, username);
    }

    public void close() throws IOException {    // 结束输出HTML
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
