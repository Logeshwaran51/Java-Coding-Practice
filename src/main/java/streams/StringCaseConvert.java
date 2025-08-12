package streams;

import java.util.Arrays;
import java.util.List;

public class StringCaseConvert {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john", "ram", "alice");

        //Method Reference
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        //Lambda Expression
        names.stream().map((String s) -> s.toUpperCase()).forEach((String res) -> System.out.println(res));

    }
}
