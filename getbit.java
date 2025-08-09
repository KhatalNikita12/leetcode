public class getbit {
    public static void main(String[] args) {
        int n=5;
        int pos=0;
        int bitmask=1<<pos;
        if((bitmask&n)==0){
            System.out.println("number is zero");
        }
        else
        System.out.println("number is one");
    }
}
