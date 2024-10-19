public class gcdOfString {
    public String gcdString(String str1,String str2){
        if(!(str1+str2).equals(str2+str1)){
            return " not common in string";

        }
        int len=gcd(str1.length(),str2.length());
    return str1.substring(0,len);
        
    }
    private int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        gcdOfString obj=new gcdOfString();
        System.out.println(obj.gcdString("ABCABC", "ABC"));
    }
}
