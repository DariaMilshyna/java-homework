package java_hw_7.task2;

public class Application {

    public static void main(String[] args) {

        TextProcessor upperCaseProcessor = new UpperCaseProcessor();
        TextProcessor reverseProcessor = new ReverseProcessor();
        TextProcessor trimProcessor = new TrimProcessor();

        String text = "  Hello. Java.  ";

        System.out.println("Upper case:");
        System.out.println(upperCaseProcessor.process(text));
        System.out.println(upperCaseProcessor.removeDigits(text));

        System.out.println();

        System.out.println("Reverse:");
        System.out.println(reverseProcessor.process(text));
        System.out.println(reverseProcessor.removeDigits(text));

        System.out.println();

        System.out.println("Trim:");
        System.out.println(trimProcessor.process(text));
        System.out.println(trimProcessor.removeDigits(text));
    }
}