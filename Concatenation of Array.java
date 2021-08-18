/*
Link: https://leetcode.com/problems/concatenation-of-array/

-----------OUTPUT-------------
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] num=new int[len*2];
        for(int i=0;i<len;i++)
            num[i]=num[i+len]=nums[i];    
        return num;
    }
}