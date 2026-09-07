package java_hw_7.task2;

public class TrimProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        return text.trim();
    }
}