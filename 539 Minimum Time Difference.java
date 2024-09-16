class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] time = new int[timePoints.size()];
        int j = 0;
        for(String str : timePoints) {
            int min = Integer.parseInt(str.substring(3));
            int hour = Integer.parseInt(str.substring(0,2));
            time[j++] = hour * 60 + min;
        }
        int min = Integer.MAX_VALUE;
        Arrays.sort(time);
        for(int i = 0; i < time.length - 1; i++) {
            int diff = time[i+1] - time[i];
            min = Math.min(min, diff);
        }
        return Math.min(1440 - time[time.length - 1] + time[0], min);
    }
}
