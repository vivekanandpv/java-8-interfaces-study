package in.athenaeum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        foo((s) -> System.out.println(s));
    }

    public static void foo(Consumer<String> consumer) {
        List<String> names = new ArrayList<>();
        names.add("Sunil");
        names.add("Ankur");
        names.add("Vighnesh");
        names.add("Madhu");

        for(String name: names) {
            consumer.accept(name);
        }
    }
}
