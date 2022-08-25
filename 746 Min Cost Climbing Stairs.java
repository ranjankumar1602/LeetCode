class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int storage[] = new int[cost.length];
        storage[0] = cost[0];
        storage[1] = cost[1];
        for(int i = 2; i < storage.length; i++) {
            storage[i] = cost[i] + Math.min(storage[i-1], storage[i-2]);
        }
        return (Math.min(storage[storage.length-1], storage[storage.length-2]));
    }
}
