package java_hw_7.task2;

public interface TextProcessor {

    String process(String text);

    default String removeDigits(String text) {
        return text.replace(".", "");
    }
}