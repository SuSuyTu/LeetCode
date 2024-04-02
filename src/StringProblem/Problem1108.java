package StringProblem;

public class Problem1108 {
    public static String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
