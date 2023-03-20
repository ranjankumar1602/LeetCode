class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<nums.length;i++){
            int sum=nums[i]+nums[i-1];
            map.put(sum,map.getOrDefault(sum,0)+1);         
          }
        for(Map.Entry<Integer, Integer> i:map.entrySet()){
            if(i.getValue()>=2)
               return true;
            
        } 
        return false; 
        
    }
}
