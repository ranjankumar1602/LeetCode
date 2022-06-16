class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++) {
            arr[i]=nums[i];
        }
        int c=0;
        for(int j=nums.length;j<arr.length;j++) {
                arr[j]=nums[c];
            c++;
            }
        return arr;
    }
}
