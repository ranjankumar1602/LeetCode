class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i] * 2) || arr[i] % 2 == 0 && set.contains(arr[i]/2)) {
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }
}
