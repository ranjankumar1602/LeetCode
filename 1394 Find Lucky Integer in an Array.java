class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == arr[i]) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        return list.isEmpty() ? -1 : list.get(list.size() - 1);
    }
}
