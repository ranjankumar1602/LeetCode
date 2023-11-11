class Graph {
    List<List<int[]>> graph;

    public Graph(int n, int[][] edges) {
        graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            addEdge(edge);
        }

    }
    
    public void addEdge(int[] edge) {
        int[] arr = {edge[1], edge[2]};
        graph.get(edge[0]).add(arr);
    }
    
    public int shortestPath(int node1, int node2) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[node1] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        pq.add(new int[]{0, node1});
        while(!pq.isEmpty()) {
            int[] temp = pq.poll();
            int currCost = temp[0];
            int currNode = temp[1];

            if(currCost > dist[currNode]) {
                continue;
            }
            if(currNode == node2) {
                return currCost;
            }

            for(int[] edge : graph.get(currNode)) {
                int neighbor = edge[0];
                int edgeLength = edge[1];
                int newCost = edgeLength + dist[currNode];
                if(dist[neighbor] > newCost) {
                    dist[neighbor] = newCost;
                    pq.add(new int[]{newCost, neighbor});
                }
            }
        }
        return dist[node2] == Integer.MAX_VALUE ? -1 : dist[node2];
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
