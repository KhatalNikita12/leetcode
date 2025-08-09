import java.util.*;
public class TwoSumIII {
    private Map<Integer, Integer> numCounts;
    public TwoSumIII() {
        numCounts = new HashMap<>();
    }
 public void add(int number) {
        if (numCounts.containsKey(number)) {
            numCounts.put(number, numCounts.get(number) + 1);
        } else {
            numCounts.put(number, 1);
        }
    }
    public boolean find(int value) {
        for (int num : numCounts.keySet()) {
            int complement = value - num;
            if (complement == num) {
                if (numCounts.get(num) > 1) {
                    return true;
                }
            } else if (numCounts.containsKey(complement)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TwoSumIII ts = new TwoSumIII();
        ts.add(1);
        ts.add(3);
        ts.add(5);
        System.out.println(ts.find(8)); // true (1 + 3)
        System.out.println(ts.find(6)); // true (1 + 5)
        System.out.println(ts.find(10)); // false (no pairs sum to 10)
    }
}
