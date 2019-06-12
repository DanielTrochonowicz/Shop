package Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _15_Strumienie {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("abc", "abcdefg",
                "def", "idziemy", "abcdefg", "abdcc");

        task1(stringList);
    }
    public static void task1(List<String> stringList) {
        System.out.println(task1(stringList.stream().filter(s -> s.length() > 3)
                .collect(Collectors.toList())));
    }
}
