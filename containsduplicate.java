import java.util.*;
class containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(visited.contains(nums[i])){
                return true;
            }
            else
            visited.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        containsduplicate cd = new containsduplicate();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(cd.containsDuplicate(nums1)); // true
        System.out.println(cd.containsDuplicate(nums2)); // false
    }
}