class Solution {
    private void allPathsSourceTarget(int[][] graph, int node, List<Integer> path, List<List<Integer>> ans) {
        if(node == graph.length - 1) {
            ans.add(new ArrayList(path));
            return;
        }
        for(int i : graph[node]) {
            path.add(i);
            allPathsSourceTarget(graph, i, path, ans);
            path.remove(path.size() - 1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        if(graph.length == 0) {
            return ans;
        }
        List<Integer> path = new ArrayList<>();
        path.add(0);
        allPathsSourceTarget(graph, 0, path, ans);
        return ans;
    }
}
