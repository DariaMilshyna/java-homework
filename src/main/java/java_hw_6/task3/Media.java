package java_hw_6.task3;

public class Media {

    protected String title;
    protected int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Відтворення мультимедіа");
    }
}