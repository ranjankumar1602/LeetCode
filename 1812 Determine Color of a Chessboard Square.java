class Solution {
    public boolean squareIsWhite(String coordinates) {
        char alpha = coordinates.charAt(0);
        int digit = coordinates.charAt(1) - '0';
        if(alpha == 'a' || alpha == 'c' || alpha == 'e' || alpha == 'g') {
            return digit % 2 == 0;
        }else {
            return digit % 2 != 0;
        }
    }
}
