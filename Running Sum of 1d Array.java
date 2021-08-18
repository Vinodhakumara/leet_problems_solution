/*
Link: https://leetcode.com/problems/running-sum-of-1d-array/
----------OUTPUT-----------
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/

class Solution {
    public int sum(int first,int second)
    {
        return first+second;
    }
    
    public int[] runningSum(int[] nums) {
            int len=nums.length;
            int[] runSum= new int[len];
            int temp=0;
        
            for(int i=0;i<len;i++){
            runSum[i]=temp=sum(temp,nums[i]);
            }
        
        return runSum;   
    }
}