// 344. Reverse String

// Write a function that reverses a string. The input string is given as an array of characters s.
// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

class reverse {
    public void reverseString(char[] s) {
         for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
         }
    }
    public static void main(String args[]){
        reverse r=new reverse();
       char[] chars = {'h','e','l','l','o'};
        r.reverseString(chars);
     
        System.out.println(chars);
    }
}

//onleetcode
class Solution {
    public void reverseString(char[] s) {
         for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
         }
    }
}