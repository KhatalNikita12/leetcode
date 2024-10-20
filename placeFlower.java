class placeFlower{
    public boolean canPlaceFlower(int[] flowerbed,int n){
        if(n==0) 
        return true;
        int cnt=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0)&& (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                cnt++;

                if(cnt==n)
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        placeFlower pf = new placeFlower();
        int [] flowerbed={0,1,0,1,0,1,0,0};
        System.out.println(pf.canPlaceFlower(flowerbed, 1));
    }
}