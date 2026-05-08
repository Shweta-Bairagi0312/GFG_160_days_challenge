static class pair implements Comparable<Pair>{
    int n;
    int path;

    public Pair(int n, int path){
        this.n = n;
        this.path = path;
    }

    @Override
    public int compareTo(pair p2){
        return this.path-p2.path;// path based sorting
    }
}


public static void dijakstra(ArrayList<Edge>graph[], int src){
    int dist[] = new int[graph.length];
    for(int i = 0; i<graph.length; i++){
        if(i != src){
            dist[i] = Integer.MAX_VALUE;
        }
    }

    boolean vis[] = new boolean[graph.length];
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    pq.add(new Pair(src,0));
    while(!pq.isEmpty()){
        pair curr = pq.remove();
        if(!vis[curr.n]){
            vis[curr.n] = true;
            for(int i = 0; i<graph[curr.n].size(); i++){
                Edge e = graph[curr.n].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(dist[u]+wt<dist[v]){
                    dist[v] = dist[u]+wt;
                    pq.add(v,dist[v]);
                }
            }
        }
        for(int i = 0; i<dist.length; i++){
            System.out.println(dist[i]+" ");
        }



    }
}
