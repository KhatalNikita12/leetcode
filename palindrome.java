class palindrome{
    public boolean ispalindrome(int n){
        if(n<0 || (n%10==0 && n!=0)){
            return false;
        }
        int rev=0,number=n;
        while(n>0){
            rev =rev*10+n%10;
            n=n/10;
        }
        return rev==number;
    }
    public static void main(String[] args) {
        palindrome p=new palindrome();
        System.out.println(p.ispalindrome(121));
        System.out.println(p.ispalindrome(123));
    }
}
