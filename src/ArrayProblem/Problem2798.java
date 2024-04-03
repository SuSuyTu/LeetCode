package ArrayProblem;

public class Problem2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for (int hour : hours) {
            if (hour >= target) {
                result += 1;
            }
        }
        return result;
    }
}
