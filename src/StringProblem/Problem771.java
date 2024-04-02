package StringProblem;

public class Problem771 {
    public int numJewelsInStones(String jewels, String stones) {
        int n = 0;
        for (int i = 0; i < stones.toCharArray().length; i++) {
            for (int j = 0; j < jewels.toCharArray().length; j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    n += 1;
                }
            }
        }
        return n;
    }
}
