package demo11_composite.demo;

//TODO RuntimeException不处理也可以编译通过，发生错误时交给JVM处理，运行停止。最后try catch一下
public class FileTreatmentException extends RuntimeException{

    public FileTreatmentException() {}

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
