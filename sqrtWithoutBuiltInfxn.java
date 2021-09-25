public class sqrtWithoutBuiltInfxn {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPerfectSquare(n));
    }

    static boolean isPerfectSquare(int num){
        long start=0;
        long end=num;
        if(num < 2){
            return true;
        }
        while(start <= end){
            long mid= start+(end-start)/2;
            if( mid*mid==num){
                return true;
            }
            else if (mid*mid > num ) {
                end = (mid - 1);
            } else {
            start= (mid + 1);
            }
        }
        return false;
    }
}
