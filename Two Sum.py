"""
Link: https://leetcode.com/problems/two-sum/
-----------------OUTPUT--------------------
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
"""
class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        int len= nums.length,k=1,i=0;
        int[] res= new int[2];
     while((nums[i]+nums[k])!=target && (i-1) != len)
     {
         k++;
         if(k == len && i != len-1)
         {       
             i++;
             k=i+1;
         }
         if( i == len-1 )
             break;
     } 
        res[0]=i;
        res[1]=k;
        return res;
    }
}