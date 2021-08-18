/*
Link: https://leetcode.com/problems/richest-customer-wealth/
----------OUTPUT----------
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/

class Solution {
      
    public int maximumWealth(int[][] nums) {
          int max=0;
    for(int row=0;row<nums.length;row++){
        int add=0;
        for(int col=0;col<nums[row].length;col++){
          add+=nums[row][col];
        }
      if(max<add){
        max=add;
      }
    }
    return max;  
    }
}