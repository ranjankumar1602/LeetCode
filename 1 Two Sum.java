class Solution {
    static int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i , j};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int nums[] = {1 , 4 , 5 , 11 , 12};
        int target = 9;
        for(int x : twoSum(nums , target))
            System.out.print(x + " ");
    }
}
