"""
Link: https://leetcode.com/problems/count-items-matching-a-rule/

----------------OUTPUT-------------
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
"""
key=["type","color","name"]
print( (len(list(filter(lambda x:  ruleValue == x[items.index(ruleKey)] , items)))) )