/*
Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
-----------OUTPUT--------------
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
*/

// Approach 1
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
    int count=0;
    int[] list=new int[nums.length];
    for(int i=0;i<nums.length;i++){
      count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] < nums[i]){
                count+=1;
                }
                list[i]=count;
        }
    }
        return list;
    }
}

// Approach 2
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a[]=new int[101];
        int sum=0;
		
        for(int i=0;i<nums.length;i++)
        {
          a[nums[i]]++;
        }
        
        for(int i=0;i<101;i++)
        {
            sum+=a[i];
            a[i]=sum-a[i];
        }
       for(int i=0;i<nums.length;i++)
        {
            nums[i]=a[nums[i]];
        }
        return nums ;
    }
}