class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int len=s.length()-1;
        while(len>=0 && s.charAt(len)==' ') {
            
            len--;
        }
        while(len>=0 && s.charAt(len)!=' ') {
            count++;
            len--;
        }
        return count;
    }
}
