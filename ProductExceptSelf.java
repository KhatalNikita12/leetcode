public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            output[i] = 1; 
            for (int j = 0; j < n; j++) {
               
                if (i != j) {
                    output[i] *= nums[j]; 
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] result = productExceptSelf(nums);
        
        
        for (int value : result) {
            System.out.print(value + " "); 
        }
    }
}
