/*
Link: https://leetcode.com/problems/count-items-matching-a-rule/

----------------OUTPUT-------------
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
*/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
              int count=0;
              int len=items.size();
              for(int i=0;i<len;i++)
                  if(items.get(i).get((ruleKey.equals("type"))?0 :(ruleKey.equals("color"))? 1:2).equals(ruleValue) )
                      count++;
              return count;
    }
}