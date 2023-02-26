class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int arr[] = new int[200];
        int arr1[] = new int[200];
        for(int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i)] != arr1[t.charAt(i)]){
                return false;
            }
            arr[s.charAt(i)] = i+1;
            arr1[t.charAt(i)] = i+1;
        }
        return true;
    }
}
