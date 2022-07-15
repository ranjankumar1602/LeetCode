class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="",b="";
        a=String.join(a,word1);
        b=String.join(b,word2);
        if(a.equals(b)) {
            return true;
        }
        return false;
    }
}
