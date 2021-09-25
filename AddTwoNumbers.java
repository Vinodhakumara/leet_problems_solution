public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1={2,4,3},l2={5,6,4};
        int a=0,b=0;
        for (int i = 0; i < l2.length; i++) {
            a=l1[l1.length-i-1]+a*10;
            b=l2[l2.length-i-1]+b*10;
        }
        System.out.println(a+b);
    }
}
