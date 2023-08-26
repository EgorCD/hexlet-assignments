package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

    public static String getForwardedVariables(String content) {
        return Arrays.stream(content.split("\n")) // разделить содержимое на строки
                .filter(line -> line.startsWith("environment")) // фильтрация строк, начинающихся с "environment"
                .flatMap(line -> Arrays.stream(line.split("\"")[1].split(","))) // разделить строку на отдельные переменные
                .filter(var -> var.startsWith("X_FORWARDED_")) // выбрать только те переменные, которые начинаются с "X_FORWARDED_"
                .map(var -> var.replaceAll("X_FORWARDED_", "")) // удалить префикс "X_FORWARDED_"
                .collect(Collectors.joining(",")); // объединить все переменные в одну строку
    }
}
//END
