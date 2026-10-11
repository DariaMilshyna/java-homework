package java_hw_6.task3;

public class Video extends Media {

    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Відтворюється відео " + title
                + " в роздільній здатності " + resolution);
    }
}