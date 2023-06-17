class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>(Collections.nCopies(rowIndex + 1,0));
        list.set(0, 1);
        for(int i = 1; i <= rowIndex; i++) {
            for(int j = i; j > 0; j--) {
                list.set(j, (list.get(j) + list.get(j - 1))); 
            }
        }
        return list;
    }
}
