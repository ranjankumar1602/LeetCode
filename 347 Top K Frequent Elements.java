class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i: nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i,0);
            }
        }
        //
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        for(int key : map.keySet()){
            queue.add(new Pair<Integer, Integer>(key, map.get(key)));
        }
        
        int[] ans = new int[k];
        int i = 0;
        
        while (k > 0){
            ans[i] = queue.poll().getKey();
            i++;
            k--;
        }
        
        return ans;
    }
}
