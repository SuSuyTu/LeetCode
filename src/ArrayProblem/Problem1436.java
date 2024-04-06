package ArrayProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Problem1436 {
    public String destCity(List<List<String>> paths) {
        List<String> sources = new ArrayList<>();
        List<String> destinations = new ArrayList<>();
        for (List<String> path : paths) {
            sources.add(path.get(0));
            destinations.add(path.get(1));
        }
        String result = "";
        for (String destination : destinations) {
            if (!sources.contains(destination)) {
                result = destination;
                break;
            }
        }
        return result;
    }
}
