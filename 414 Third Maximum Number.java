class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        Set<Integer> present = new HashSet<>();

        for(int i : nums) {
            if(present.contains(i)) {
                continue;
            }

            if(min.size() == 3) {
                if(min.peek() < i) {
                    present.remove(min.poll());
                    min.add(i);
                    present.add(i);
                }
            }else {
                min.add(i);
                present.add(i);
            }
        }
        if(min.size() == 1) {
            return min.peek();
        }else if(min.size() == 2) {
            return Math.max(min.poll(), min.peek());
        }

        return min.peek();
    }
}
