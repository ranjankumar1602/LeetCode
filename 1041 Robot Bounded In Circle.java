class Solution {
    public boolean isRobotBounded(String instructions) {
        // creating the direction array
        int[][] dir = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        // Taking axis and index
        int x = 0;
        int y = 0;
        int i = 0;
        for(char c : instructions.toCharArray()) {
            if(c == 'L') {
                i = (i + 1) % 4;
            }else if(c == 'R') {
                i = (i + 3) % 4;
            }else {
                x = x + dir[i][0];
                y = y + dir[i][1];
            }
        }
        return x == 0 && y == 0 || i != 0;
    }
}
