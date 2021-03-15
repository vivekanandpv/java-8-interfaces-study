package in.athenaeum;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        //  Function<String, Integer> stringLengthFunction = s -> s.length();

        foo(i -> System.out.println(i), s -> s.length());

        BiFunction<String, LocalDateTime, String> concatenateBiFunction = (s1, ldt) -> s1 + " " + ldt.toString();

        System.out.println(concatenateBiFunction.apply("Hello", LocalDateTime.now()));

        Predicate<String> isAllCaps = s -> s.equals(s.toUpperCase());

        System.out.println(isAllCaps.test("Fails"));
        System.out.println(isAllCaps.test("PASSES"));
    }

    public static void foo(Consumer<Integer> consumer, Function<String, Integer> transformer) {
        List<String> names = new ArrayList<>();
        names.add("Sunil");
        names.add("Ankur");
        names.add("Vighnesh");
        names.add("Madhu");

        for(String name: names) {
            consumer.accept(transformer.apply(name));
        }
    }


}
