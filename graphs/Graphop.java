package javaprojects.dsa.graphs;

import java.util.*;

class Graph<T>{
    private Map<T, List<T>> map=new HashMap<>();

    public void addVertex(T s){
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T s, T d, boolean bidirectional){
        if(!map.containsKey(s)){
            addVertex(s);
        }
        if(!map.containsKey(d)){
            addVertex(d);
        }

        map.get(s).add(d);
        if(bidirectional==true){
            map.get(d).add(s);
        }
    }

    public int counteVertices(){
        return map.keySet().size();
    }
    public int countEdges(boolean bidirectional){
        int count=0;
        for(T v: map.keySet()){
            count=count+map.get(v).size();
        }
        if(bidirectional==true){
            count=count/2;
        }
        return count;
    }

    public boolean containsVertex(T v){
       return map.containsKey(v);
    }

    public boolean containsEdge(T s, T d){
        if(!map.containsKey(s)){
            return false;
        }
        return map.get(s).contains(d);

    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        for (T v : map.keySet()) {
            sb.append(v.toString()+":");
            for (T w : map.get(v)) {
                sb.append(w.toString()+" ");
            }
            sb.append("\n");
        }
        sb.append("Vertices: "+counteVertices());
        sb.append("\nEdges: "+countEdges(true));
        return sb.toString();
    }

}

public class Graphop {
    public static void main(String[] args) {
        Graph g=new Graph();
        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, false);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(2, 4, true);
        g.addEdge(3, 0, false);
        g.addEdge(2, 0, false);

        System.out.println("Graph:\n"+g.toString());
        System.out.println(g.containsEdge(1, 4));
        System.out.println(g.containsEdge(2, 4));
        System.out.println(g.containsEdge(3, 4));
        System.out.println(g.containsVertex(4));

    }
}
