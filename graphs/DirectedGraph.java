package javaprojects.dsa.graphs;

import java.util.*;

class Edge{
    int source, destination, weight;
    Edge(int s, int d, int w){
        this.source=s;
        this.destination=d;
        this.weight=w;
    }
}

class G{
    List<List<Integer>> adjlist=new ArrayList<>();
    public G(List<Edge> edges){
        int n=0;
        for(Edge e: edges){
            n=Integer.max(n, Integer.max(e.source, e.destination));
        }

        for(int i=0;i<=n;i++){
            adjlist.add(i, new ArrayList<>());
        }

        for(Edge e:edges){
            adjlist.get(e.source).add(e.destination);
        }

    }

    public void showGraph(G g){
        int s=0;
        int n=g.adjlist.size();
        while(s<n){
            for(int d:g.adjlist.get(s)){
                System.out.print(s+" --> "+d+"\t");
            }
            System.out.println();
            s++;
        }
    }

}

public class DirectedGraph {
    public static void main(String[] args) {
        List<Edge> edges=Arrays.asList(
            new Edge(1, 4, 3), 
            new Edge(4, 2, 5),
            new Edge(2,5,10),
            new Edge(5, 1, 6),
            new Edge(3, 2, 9),
            new Edge(1, 5, 1),
            new Edge(3, 5, 2)
            );
        G g=new G(edges);
        g.showGraph(g);
    }
}
