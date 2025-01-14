import java.util.*;
public class diff2array {
    public List<List<Integer>> findDifference(int nums1[],int nums2[]){
        Set <Integer> s1=new HashSet<>();
        Set <Integer> s2=new HashSet<>();
        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            s2.add(num);
        }
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int v:s1){
            if(!s2.contains(v)){
                l1.add(v);
            }
        }
        for(int v:s2){
            if(!s1.contains(v)){
                l2.add(v);
            }
        }
        return List.of(l1,l2);
    }
    public static void main(String[] args) {
        diff2array obj=new diff2array();
        int arr1[]={1,2,3};
        int arr2[]={2,4,6};
        System.out.println(obj.findDifference(arr1,arr2));
    }
}
