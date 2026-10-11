package java_hw_12.task1;

public class MyFile implements CanBeClosed {

    @Override
    public void close() {
        System.out.println("File closed");
    }
}