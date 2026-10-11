package java_hw_12.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();

        List<CanBeClosed> entities = new ArrayList<>();

        entities.add(browser);
        entities.add(file);

        SessionCloser sessionCloser = list -> {
            for (CanBeClosed entity : list) {
                entity.close();
            }
        };

        sessionCloser.closeSession(entities);
    }
}