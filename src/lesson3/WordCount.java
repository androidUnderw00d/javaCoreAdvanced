package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WordCount {

    public static void main(String[] args) {
        wordCount();
    }


    private static void wordCount() {

        int count = 0;

        List<String> wordList = new ArrayList<>(Arrays.asList("Аз", "Веди", "Веди", "Глагол", "Добро", "Буки", "Веди", "Глагол", "Добро", "Аз", "Живите"));

        System.out.println(wordList);

        Iterator<String> iterator = wordList.iterator();
        while (iterator.hasNext()) {
            getCount(count, wordList);
        }
    }

    private static void getCount(int count, List<String> wordList) {
        String word;
        word = wordList.get(0);

        Iterator<String> iterator = wordList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(word)) {
                count++;
                iterator.remove();
            }
        }
        System.out.println(word + " повторяется " + count + " раза ");
    }
}
