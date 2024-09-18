import java.util.Arrays;
import java.util.Comparator;

public class largestnumber {
    public String largerstnum(int[] nums){
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            // arr[i]=Integer.toString(nums[i]);
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,new Comparator<String>() {
           public int compare(String a,String b) {
            return (b+a).compareTo(a+b);
           }
        });
        StringBuffer sb=new StringBuffer();
        for(String s:arr){
            sb.append(s);
        }
        while(sb.charAt(0)=='0' && sb.length()>1){
            sb.deleteCharAt(0);
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        largestnumber l=new largestnumber();
        int[] nums={3,30,34,5,9};
        System.out.println(l.largerstnum(nums));
    }
}
