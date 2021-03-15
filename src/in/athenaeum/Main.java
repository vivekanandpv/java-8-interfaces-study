package in.athenaeum;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        //  Anonymous class implementation
        //  https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });


        Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName()));

        t.start();

        System.out.println(Thread.currentThread().getName());

        List<String> names = new ArrayList<>();
        names.add("Sunil Nagar");
        names.add("Madhavanand");
        names.add("Rahul");
        names.add("Shrikar Joshi");

        names.sort((s1, s2) -> s2.length() - s1.length());

        for(String name: names) {
            System.out.println(name);
        }
    }
}
