package demo15_facade.demo.page_maker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//完成P1要求=>删除public
class Database {

    private Database(){}

    public static Properties getProperties(String dbName) {
        String filename = dbName + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: "+filename+" is not found.");
            e.printStackTrace();
        }
        return prop;
    }
}
