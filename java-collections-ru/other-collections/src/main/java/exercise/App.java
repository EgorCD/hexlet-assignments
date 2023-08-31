package exercise;

import java.util.*;

public class App {

    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> result = new LinkedHashMap<>();

        // Создаем объединенный список ключей из обоих словарей
        TreeSet<String> allKeys = new TreeSet<>(data1.keySet());
        allKeys.addAll(data2.keySet());

        for (String key : allKeys) {
            boolean presentInData1 = data1.containsKey(key);
            boolean presentInData2 = data2.containsKey(key);

            if (presentInData1 && presentInData2) {
                if (Objects.equals(data1.get(key), data2.get(key))) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            } else if (presentInData1) {
                result.put(key, "deleted");
            } else {
                result.put(key, "added");
            }
        }

        return result;
    }
}
