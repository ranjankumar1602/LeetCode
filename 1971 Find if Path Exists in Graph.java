class Solution {
    boolean valid = false;
    private void dfs(Map<Integer, List<Integer>> graph, boolean[]visited, int start, int end) {
        if(visited[start] || valid) {
            return;
        }
        visited[start] = true;
        for(int neighbour : graph.get(start)) {
            if(neighbour == end) {
                valid = true;
                break;
            }
            if(!visited[neighbour]) {
                dfs(graph, visited, neighbour, end);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) {
            return true;
        }
        Map<Integer, List<Integer>> graph = new HashMap();
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList());
        }
        for(int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        dfs(graph, visited, source, destination);
        return valid;
    }
}
