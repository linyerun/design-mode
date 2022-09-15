package demo02_Adapter.demo03_homework.content;

import java.io.IOException;

//target
public interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeToFile(String filename) throws IOException;
    void setValue(String key, String value);
    String getValue(String key);
}
