import java.util.ArrayList;
class MaxCandies{
    public ArrayList<Boolean> kidWithCandies(int [] candies,int extracandies){
        ArrayList al=new ArrayList();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
            max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            int sum=candies[i]+extracandies;
            if(sum>=max)
            al.add(true);
            else
            al.add(false);
        }
        return al;
    }
   public static void main(String[] args) {
    MaxCandies obj=new MaxCandies();
        int [] arr={2,3,5,1,3};
        System.out.println(obj.kidWithCandies(arr,3));
   }
}