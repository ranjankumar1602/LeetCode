class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for(int i = 0; i < result.length; i++) {
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                result[i] ^= arr[j];
            }
        }
        return result;
    }
}
