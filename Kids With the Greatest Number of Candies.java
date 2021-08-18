/*
Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
----------OUTPUT----------
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
*/

import java.util.Arrays;
class Solution {
   int largest(int[] nums)
   {
            if(nums.length==0)
                  return -1;
            int max=nums[0];
            for(int i=1;i<nums.length;i++)
            {
              if(max<nums[i])
                max=nums[i];
            }
    return max;
  }
    public List<Boolean> kidsWithCandies(int[] nums, int extraCandies) {
            int max=largest(nums);
            Boolean[] list=new Boolean[nums.length];
            for(int i=0;i<nums.length;i++){
              if((nums[i]+extraCandies >= max))
                  list[i]=true;
              else
                  list[i]=false;
            }
            return Arrays.asList(list);
    }
}