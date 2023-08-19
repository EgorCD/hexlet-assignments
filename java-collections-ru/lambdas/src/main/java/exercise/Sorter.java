package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> "male".equals(user.get("gender")))
                .sorted(Comparator.comparing(user -> LocalDate.parse(user.get("birthday"))))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }
}
// END
