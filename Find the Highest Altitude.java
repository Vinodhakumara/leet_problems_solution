/*
Link: https://leetcode.com/problems/find-the-highest-altitude/
-------------OUTPUT---------------
Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
*/
# Approach 1
class Solution {
    public int largestAltitude(int[] gain) {
            int temp=0,len= gain.length;
            int[] list=new int[len+1];
            list[1]=gain[0];
            if(temp<=list[1])
                temp=list[1];
            for(int i=1;i<len;i++){
                    list[i+1]=gain[i]+list[i];
                    if(temp<=list[i+1])
                        temp=list[i+1]; 
            }
            return temp;
    }
}
# Approach 2
class Solution {
    public int largestAltitude(int[] gain) {
            int temp=0 ,len= gain.length, large=0;
            for(int i = 0; i < len ; i++)
			{
					temp += gain[i];
					if(large < temp) large = temp;
			}
            return large;
    }
}