package StringProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int type = 0;
        switch (ruleKey) {
            case "type":
                type = 0;
                break;
            case "color":
                type = 1;
                break;
            case "name":
                type = 2;
                break;
            default:
                break;
        }
        for (List<String> item : items) {
            if (item.get(type).equals(ruleValue)) {
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        System.out.println(countMatches(items, "type", "phone"));
    }
}
