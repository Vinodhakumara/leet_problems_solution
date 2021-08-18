"""
Link: https://leetcode.com/problems/flipping-an-image/

            OUTPUT
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
"""
class Solution {
    public int[][] flipAndInvertImage(int[][] col) {
        int len=col.length;
        int row_len=col[0].length;;
        int[][] list=new int[row_len][len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<row_len;j++)
            {
                if(1 == col[i][row_len-1-j])
                    col[i][row_len-1-j]=0;
                else 
                    col[i][row_len-1-j]=1;
                list[i][j]=col[i][row_len-1-j];
            }
        }
        return list;
    }
}