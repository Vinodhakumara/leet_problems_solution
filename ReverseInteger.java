public class ReverseInteger {
    public static void main(String[] args) {
        int num=0,res=0;
        int n=121;
        while(n > 0){
            int rem=n%10;
            num=rem+num*10;
            if((num-rem)/10 != res){
                System.out.println(0);;
            }
            res=num;
            n=n/10;
        }
    System.out.println(num+" "+n);
    }
}
