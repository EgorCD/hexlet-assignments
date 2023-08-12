package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");

        return emails.stream()
                // Turn email in domain
                .map(email -> email.substring(email.lastIndexOf("@") + 1))
                // Filter emails based on domain
                .filter(freeDomains::contains)
                // Count
                .count();
    }
}
// END
