public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    
    ArrayList<Integer> bfs = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();
    boolean visited[]=new boolean[V];
    q.add(0);
    visited[0]=true;
    while(!q.isEmpty()){
        int node = q.poll();
        bfs.add(node);
        
        for(Integer it:adj.get(node)){
            if(visited[it]==false){
                visited[it]=true;
                q.add(it);
                
            }
        }
    }
    return bfs;
    
}