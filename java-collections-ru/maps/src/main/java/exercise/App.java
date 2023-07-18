package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN

public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Проверка на пустую строку или строку, состоящую только из пробелов
        if (sentence == null || sentence.trim().isEmpty()) {
            return wordCount;
        }

        String[] words = sentence.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) { // Дополнительная проверка на пустое слово
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }

        return wordCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {

        if (wordsCount.isEmpty()) {
            return "{}";
        }

        StringBuilder String = new StringBuilder("{\n");

        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            String.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        String.append("}");

        return String.toString();
    }
}

//END
