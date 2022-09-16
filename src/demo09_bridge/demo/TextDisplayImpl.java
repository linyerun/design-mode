package demo09_bridge.demo;

import java.io.*;

//Practice-2
public class TextDisplayImpl extends DisplayImpl{

    private String filename;

    public TextDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        System.out.println("==========start show text content===========");
    }

    @Override
    public void rawPrint() {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String content = null;
        try {
            while ((content=br.readLine())!=null) {
                System.out.println(content);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void rawClose() {
        System.out.println("===========stop show text content===========");
    }
}
