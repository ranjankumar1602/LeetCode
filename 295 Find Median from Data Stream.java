class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;

    public MedianFinder() {
        max = new PriorityQueue<Integer>(Collections.reverseOrder());
        min = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || max.peek() >= num) {
            max.add(num);
        }else {
            min.add(num);
        }
        if(max.size() > min.size() + 1) {
            min.add(max.poll());
        }else if(max.size() < min.size()) {
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if(min.size() == max.size()) {
            return (min.peek() / 2.0) + (max.peek() / 2.0);
        }
        return max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
