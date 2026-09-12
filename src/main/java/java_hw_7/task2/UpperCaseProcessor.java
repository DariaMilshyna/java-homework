package java_hw_7.task2;

public class UpperCaseProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}