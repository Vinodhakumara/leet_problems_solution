// https://leetcode.com/explore/challenge/card/september-leetcoding-challenge-2021/638/week-3-september-15th-september-21st/3982/
public class findMaxConsicutive {
    public static void main(String[] args) {
        int count=0,temp=0;
        for(int i=0;i < nums.length;i++){
            if(nums[i] == 1){
                count++;
                if(temp < count){
                temp=count;
                }
            }else{
                count=0;
            }
        }
        System.out.println(temp);
    }
}
