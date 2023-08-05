package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTakeNormalList() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = App.take(numbers, 2);
        assertThat(result).isEqualTo(Arrays.asList(1, 2));
    }

    @Test
    void testTakeMoreThanSize() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> result = App.take(numbers, 8);
        assertThat(result).isEqualTo(Arrays.asList(7, 3, 10));
    }

    @Test
    void testTakeEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = App.take(numbers, 3);
        assertThat(result).isEqualTo(new ArrayList<>());
    }

    @Test
    void testTakeZeroElements() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> result = App.take(numbers, 0);
        assertThat(result).isEqualTo(new ArrayList<>());
    }
}
