package StringProblem;

import java.util.Arrays;

public class Problem2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if ((operations[i].equals("X++")) || (operations[i].equals("++X"))) {
                x += 1;
            } else if ((operations[i].equals("--X")) || (operations[i].equals("X--"))) {
                x -= 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
