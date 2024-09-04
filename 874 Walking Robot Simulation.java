class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0, d = 0;
        int [][]direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int max = 0;
        Set<String> obstacleSet = new HashSet<>();
        for(int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }
        for(int command : commands) {
            if(command == -1) {
                d = (d + 1) % 4;
            }else if(command == -2){
                d = (d + 3) % 4;
            }else{
                for(int i = 0; i < command; i++){
                    int nx = x + direction[d][0];
                    int ny = y + direction[d][1];
                    if(obstacleSet.contains(nx + "," + ny)){
                        break;
                    }
                    x = nx;
                    y = ny;
                    max = Math.max(max, x * x + y * y);
                }
            }
        }
        return max;
    }
}
