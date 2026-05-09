static class pair implements Comparable<Pair>{
    int v;
    int cost;

    public pair(int v, int c){
        this.v = v;
        this.cost = c;
    }

    @Override
    public int compareTo(Pair p2){
        return this.cost-p2.cost;
    }
}

public static void Prims(ArrayList<Edge>graph[]){
    boolean vis[] = new boolean[graph.length];
    PriorityQueue<pair>pq = new PriorityQueue<>();
    pq.add(new pair(0,0));
    int finalcost = 0;

    while(!pq.isEmpty()){
        pair curr = pq.remove();
        if(!vis[curr.v]){
            vis[curr.v] = true;
            finalcost += curr.cost;

            for(int i = 0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].gt(i);
                pq.add(new pair(e.dest,e.wt));
            }
        }

    }

    System.out.println(finalcost);
}
