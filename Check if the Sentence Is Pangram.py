"""
Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
---------OUTPUT----------
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
"""
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        return len(set(sentence))==26
        
        