package java_hw_2.task_2;

public class Main {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String[] phraseArray = string.split(" ");
        boolean answer = true;
        int wordLength = phraseArray[0].length();
        for (int i = 0; i < phraseArray.length; i++) {
            if (phraseArray[i].endsWith(",")){
                phraseArray[i] = phraseArray[i].substring(0, phraseArray[i].length() - 1);
            }
            System.out.println("word" + (i + 1) + "=" + phraseArray[i] + ", word length = " + phraseArray[i].length());
            if (wordLength < phraseArray[i].length()){
                answer = false;
            }
        }
        System.out.println(answer);
    }
}
