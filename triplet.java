public class triplet {
    public boolean increasingtriplet(int nums[]){
        int small=Integer.MAX_VALUE;
        int middle=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>middle)
            return true;
            if(num<=small)
            small=num;
            else
            middle=num;
        }
        return false;
    }
    public static void main(String[] args) {
        triplet tp=new triplet();
        int num[]={1,2,3,4,5};
       System.out.println( tp.increasingtriplet(num));
    }
}
