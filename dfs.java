public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer> ans){
    //making current node visited
    visited[node]=true;
    //dfs
    ans.add(node);
    //getting neighbour nodes
    for(int it:adj.get(node)){
        if(visited[it]==false){
            dfs(it,adj,visited,ans);
        }
    }
    
}

//driver
public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    boolean visited[]=new boolean[V+1];
    ArrayList<Integer> ans= new ArrayList < > ();
    dfs(0,adj,visited,ans);
    return ans;
}