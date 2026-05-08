static class pair implements Comparable<Pair>{
    int n;
    int path;

    public Pair(int n, int path){
        this.n = n;
        this.path = path;
    }

    @Override
    public int compareTo(pair p2){
        return this.path-p2.path;    // path based sorting
    }
}


public static void dijakstra(ArrayList<Edge>graph[], int src){
    int dist[] = new int[graph.length];
    for(int i = 0; i<graph.length; i++){
        if(i != src){
            dist[i] = Integer.MAX_VALUE;
        }
    }


    int v = graph.length;
    for(int i = 0; i<v-1; i++){
        for(int j = 0; j<graph.length; j++){
            for(int k = 0; k<graph[j].size(); k++){
                Edge e = graph[j].get[k];
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(!dist[u] != Integer.MAX_VALUE && dist[u]+wt <dist[v]){
                    dist[v] = dist[u]+wt;

                }
            }
        }
    }


      for(int i = 0; i<dist.length; i++){
        System.out.println(dist[i]+" ");
      }




    }
}
