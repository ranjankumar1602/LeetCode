class OrderedStream {
    int ptr;
    String[] temp;
    public OrderedStream(int n) {
        ptr = 0;
        temp = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        temp[idKey - 1] = value;
        while(ptr < temp.length && temp[ptr] != null) {
            list.add(temp[ptr]);
            ptr++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
