/*
Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
---------OUTPUT----------
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/

// Approach 1
class Solution {
    public boolean checkIfPangram(String sentence) {
              String ls="abcdefghijklmnopqrstuvwxyz";
for(int i=0;i<ls.length();i++){
          if(sentence.indexOf(ls.charAt(i))==-1){
            return false;
          }
          
      }
        return true;
    }
}
// Approach 2
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> ls=new HashSet<>();
        for(char ch: sentence.toCharArray()){
            ls.add(ch);
        }
        return ls.size()==26;
    }
}