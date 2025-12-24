class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i : apple) {
            sum += i;
        }
        Integer[] possible = new Integer[capacity.length];
        for(int i = 0; i < capacity.length; i++) {
            possible[i] = capacity[i];
        }

        Arrays.sort(possible, Collections.reverseOrder());

        int req = 0;
        while(sum > 0) {
            sum -= possible[req];
            req += 1;
        }

        return req;
    }
}
