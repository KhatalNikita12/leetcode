public class maxavgsubarray {
    public double findMaxAverage(int nums[],int k){
        int currsum=0;
        for(int i=0;i<k;i++){
            currsum+=nums[i];

        }
        int maxsum=currsum;
        for(int i=k;i<nums.length;i++){
            currsum+=(nums[i]-nums[i-k]);
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum*1.0/k;
    }
    public static void main(String[] args) {
        maxavgsubarray obj = new maxavgsubarray();
        int nums[]={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(obj.findMaxAverage(nums, k));
    }
}
