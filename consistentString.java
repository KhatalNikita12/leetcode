import java.util.*;
public class consistentString {
    public int countConsistentString(String allowed, String[] words){
Set<Character> allowedset=new HashSet<>();
for(char c:allowed.toCharArray()){
    allowedset.add(c);
}
int count=0;
for(String word:words){
    boolean isconsistent=true;
    for(char c:word.toCharArray()){
        if(!allowedset.contains(c)){
            isconsistent=false;
        }
    }
    if(isconsistent==true){
        count++;
    }
}
return count;
    }
    public static void main(String[] args) {
        consistentString cs = new consistentString();
        String allowed="abc";
        String word[]={"aa","bh","abc","ca"};
        
        System.out.println(cs.countConsistentString(allowed,word));
    }
}
