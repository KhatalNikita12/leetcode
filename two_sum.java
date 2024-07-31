
import java.util.*;

public class two_sum {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            Integer rem = target - numbers[i];
            if (hm.containsKey(rem)) {
                int result[] = {hm.get(rem), i};
                return result;
            }
            hm.put(numbers[i], i);
        }
        return null; // return null if no pair is found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers:");
        int n = input.nextInt();
        
        int numbers[] = new int[n];
        System.out.println("Enter elements in array:");
        for (int j = 0; j < n; j++) {
            System.out.println("Enter element " + (j + 1) + ":");
            numbers[j] = input.nextInt();
        }
        
        System.out.println("Enter target value:");
        int target = input.nextInt();
        
        two_sum ts = new two_sum();
        int result[] = ts.twoSum(numbers, target);
        
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to the target are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
        
        input.close(); 
    }
}
