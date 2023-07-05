package FoodShortage_04.classes;

import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        int result = nums.stream().reduce(0, (a, b) -> a + b);

    }
}
