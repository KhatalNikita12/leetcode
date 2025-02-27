// 14. Longest Common Prefix
// Write a function to find the longest common prefix string amongst an array of strings.If there is no common prefix, return an empty string "".

public class longestprefix {
    public String longestcommonprefix(String[] strs){
        if(strs.length==0 || strs==null){
            return "";
        }
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        longestprefix lp=new longestprefix();
        String arr[]={"flower","flow","flight"};
        System.out.println(lp.longestcommonprefix(arr));
        String arr1[]={"dog","racecar","car"};
        System.out.println(lp.longestcommonprefix(arr1));
    }
}
