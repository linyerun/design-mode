package demo07_builderMode.practice03;

import demo07_builderMode.practice03.content.Director;
import demo07_builderMode.practice03.content.XMLBuilder;

public class ApplicationP03 {
    public static void main(String[] args) {
        //真.建造者
        XMLBuilder xmlBuilder = new XMLBuilder();
        //监工
        Director director = new Director(xmlBuilder);
        director.construct();
        //打印结果
        System.out.println(xmlBuilder.getFilename()+" status = OK!");
    }
}
