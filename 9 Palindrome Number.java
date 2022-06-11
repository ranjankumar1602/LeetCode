class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        int num =0;
        int y= x;
        while(x>0) {
            num *= 10;
            num+=x%10;
            x/=10;
        }
        if(num==y) {
            return true;
        }else {
            return false;
        }
    }
    

}
