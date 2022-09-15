package demo02_Adapter.demo03_homework;

import demo02_Adapter.demo03_homework.content.FileIO;
import demo02_Adapter.demo03_homework.content.FileProperties;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileIO f = new FileProperties();
        f.readFromFile("src/demo02_Adapter/demo03_homework/resources/file");
        System.out.println(f.getValue("year"));
        f.setValue("year","2014");
        f.setValue("month","14");
        f.setValue("day","24");
        f.writeToFile("src/demo02_Adapter/demo03_homework/resources/newFile");
    }
}
