class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while(left <= right) {
            boat++;
            if(people[left] + people[right] <= limit) {
                left++;
                right--;
            }else {
                right--;
            }
        }
        return boat;
    }
}
