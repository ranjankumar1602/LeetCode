class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int j=n;
        int i=0;
        int x=0;
        int y=1;
        while(i<n) {
            ans[x]=nums[i];
            ans[y]=nums[j];
            i++;
            j++;
            x+=2;
            y+=2;
            
        }
        return ans;
    }
}
