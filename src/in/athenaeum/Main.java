package in.athenaeum;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Double> population = Map.of("Mumbai", 1.8, "Bengaluru", 1.3, "Chennai", 1.0);

        for(Map.Entry<String, Double> entry :population.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
