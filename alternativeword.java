// 1768. Merge Strings Alternately
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.
// Example 1:
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
public class alternativeword {
    public String mergedString(String word1, String word2){
        int n=word1.length();
        int m=word2.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n||i<m;++i){
            if(i<n) sb.append(word1.charAt(i));
            if(i<m) sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        alternativeword aw=new alternativeword();
        System.out.println(aw.mergedString("abc","xyz"));
    }
}
