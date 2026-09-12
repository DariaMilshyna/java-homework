package java_hw_6.task3;

public class Application {

    public static void main(String[] args) {

        Media media = new Media("Media", 10);
        Media music = new Music("Shape of You", 4, "Ed Sheeran");
        Media video = new Video("Java Tutorial", 20, "1920x1080");

        media.play();
        music.play();
        video.play();
    }
}