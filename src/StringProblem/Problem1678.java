package StringProblem;

public class Problem1678 {
    public static String interpret(String command) {
        String result = "";
        char[] command_in_ch = command.toCharArray();
        for (int i = 0; i < command_in_ch.length ; i++) {
            if (command_in_ch[i] == 'G') {
                result += "G";
            } else if (command_in_ch[i] == '(') {
                if (command_in_ch[i + 1] == ')') {
                    result += "o";
                } else if (command_in_ch[i + 1] == 'a') {
                    result += "al";
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
}
