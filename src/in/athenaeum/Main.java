package in.athenaeum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> {
            //...
            return "Hi there!";
        };

        //  shorter version with implicit return
        //  Supplier<String> stringSupplier = () -> "Hi there!";

        foo(stringSupplier);
    }

    public static void foo(Supplier<String> supplier) {
        List<String> names = new ArrayList<>();
        names.add("Sunil");
        names.add("Ankur");
        names.add("Vighnesh");
        names.add("Madhu");

        for(String s: names) {
            System.out.println(supplier.get() + " " + s);
        }
    }
}
