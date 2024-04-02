package StringProblem;

public class Problem1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String w1str = "";
       String w2str = "";
       for (String str : word1) {
           w1str += str;
       }
       for (String str : word2) {
           w2str += str;
       }
       return w1str.equals(w2str);
    }


}
