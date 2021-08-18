/*
Link: https://leetcode.com/problems/number-of-good-pairs/

----------OUTPUT-----------
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        if(nums.length==0)
          return -1;
        Arrays.sort(nums);
        int count=0;
        // int add=0;
        for(int j=0;j<nums.length;j++){
        for(int i=j+1;i<nums.length;i++){
          if(nums[j]!=nums[i])
              break;
          else
              count++;
        }
        }
        return count;
    }
}