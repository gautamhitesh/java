import java.util.*;

class graphsop{
    public static void main(String args[]){
        System.out.println("Hello World!...\nStarting graph program...");
        Graph g=new Graph();
        int A[]={0,1,2,3,4};
        int B[]={1,3,1,4,5};
        for (int i=0;i<A.length;i++){
            g.addEdge(A[i], B[i]);
        }

        System.out.println("Adjacency Matrix");
        System.out.println(g.toString());
        g.removeEdge(1, 2);
        System.out.println(g.toString());

    }
}


class Graph<T>{
    private Map<T,List<T>> adjVertices=new HashMap<>();

    void addVertex(T vertex){
        System.out.println("Creating vertex "+vertex);
        adjVertices.put(vertex, new LinkedList<>());
    }

    void removeVertex(T v){
        adjVertices.values().stream().forEach(e->e.remove(v));
        adjVertices.remove(v);
    }

    void addEdge(T source, T destination){
        System.out.println("Adding edge between "+source.toString()+" and "+destination.toString());
        if(!adjVertices.containsKey(source)){
          addVertex(source);  
        }
        if(!adjVertices.containsKey(destination)){
          addVertex(destination);  
        }
        adjVertices.get(source).add(destination);
        //bidirectional
        adjVertices.get(destination).add(source);
    }

    void removeEdge(T source, T destination){
        if(adjVertices.containsKey(source)){
            adjVertices.get(source).remove(destination);
        }
        if(adjVertices.containsKey(destination)){
            adjVertices.get(destination).remove(source);
        }   
    }

    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for(T v: adjVertices.keySet()){
            stringBuilder.append(v.toString()+":");
            for(T w: adjVertices.get(v)){
                stringBuilder.append(w.toString()+" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}