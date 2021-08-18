/*
Link: https://leetcode.com/problems/shuffle-the-array/
---------OUTPUT------------
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {        
        int len=nums.length;
        int[] list=new int[len];
        for(int j=0,i=0;i<len;i++,j++){
            list[i]=nums[j];
            list[i+1]=nums[len/2+j]; 
            i++;
        }
        return list;
    }   
}