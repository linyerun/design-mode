package demo02_Adapter.demo03_homework.content;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//FileProperties=>Adapter、Properties=>Adaptee
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {
        super.load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        super.store(new FileOutputStream(filename),"Write by FileProperties!");
    }

    @Override
    public void setValue(String key, String value) {
        super.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return super.getProperty(key,"");
    }
}
