package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static boolean scrabble(String symbols, String word) {
        symbols = symbols.toLowerCase();
        word = word.toLowerCase();

        List<Character> tilesList = new ArrayList<>();
        for (char c : symbols.toCharArray()) {
            tilesList.add(c);
        }

        for (char c : word.toCharArray()) {
            if (tilesList.contains(c)) {
                tilesList.remove((Character) c);
            } else {
                return false;
            }
        }
        return true;
    }
}
