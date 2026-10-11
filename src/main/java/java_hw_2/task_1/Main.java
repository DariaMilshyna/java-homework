package java_hw_2.task_1;

public class Main {
    public static void main(String[] args) {
        String string1 = "This line that I want to cut, cause it is too long";
        String string2 = string1.substring(0, 35);
        String string3 = string2.substring(0, 16) + " don't " + string2.substring(17, 35) + " it is perfect";
        System.out.println(string1 + ", " + string1.length());
        System.out.println(string2 + ", " + string2.length());
        System.out.println(string3 + ", " + string3.length());
    }
}
