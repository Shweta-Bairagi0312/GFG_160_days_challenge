import java.util.*;

public class top{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
       
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        graph[5].add(new Edge(5,5,1));
      


    }

    public static void calcIndeg(ArrayList<Edge>graph[],int[]indeg){
        for(int i = 0; i<graph.length; i++){
            int v = i;
            for(int j = 0;j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topsort(ArrayList<Edge>[]graph){
        int[] indeg = new int[graph.length];
        Queue<Integer>q = new LinkedList<>();

        for(int i = 0; i<indeg.length; i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");

            for(int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }


        System.out.println();

       

    }

    
   
    public static void main(String[] args){
        int V = 7;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
    }
    
}
