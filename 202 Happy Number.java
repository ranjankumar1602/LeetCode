class Solution {
    private static int isHappyHelper(int n) {
        int sum = 0;
        while(n > 0) {
            int remainder = n % 10;
            n /= 10;
            sum += remainder * remainder;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = isHappyHelper(n);
        }
        return n == 1;
    }
}
