//import java.util.*;
//

import java.util.ArrayList;
import java.util.List;

//// Class to represent an unidirected graph using an adjacency list
//public class Graph {
//    // Map to store vertices and their adjacency lists
//    private Map<Integer, List<Integer>> adjList = new HashMap<>();
//
//    // Function to add a vertex to the graph
//    public void addVertex(Integer node) {
//        adjList.putIfAbsent(node, new ArrayList<>());
//    }
//
//    // Function to add an undirected edge between two vertices
//    public void addEdge(Integer src, Integer dest) {
//        // Ensure both vertices exist in the graph
//        addVertex(src);
//        addVertex(dest);
//
//        // Add edge from source to destination
//        adjList.get(src).add(dest);
//        // Add edge from destination to source for undirected graph
//        adjList.get(dest).add(src);
//    }
//    public void bfsprint(){
//
//    }
//
//    // Function to print the graph
//    public void printGraph() {
//        for (Integer node : adjList.keySet()) {
//            System.out.print("Vertex " + node + " is connected to: ");
//            for (Integer neighbor : adjList.get(node)) {
//                System.out.print(neighbor + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    // Example usage in the main method
//    public static void main(String[] args) {
//        Graph g = new Graph();
//
//        // Add vertices
//        g.addVertex(1);
//        g.addVertex(2);
//        g.addVertex(3);
//        g.addVertex(4);
//        g.addVertex(5);
//
//        // Add edges
//        g.addEdge(1, 2);
//        g.addEdge(1, 3);
//        g.addEdge(1, 4);
//        g.addEdge(2, 4);
//        g.addEdge(2, 5);
//        g.addEdge(3, 4);
//        g.addEdge(3, 5);
//        g.addEdge(4, 5);
//
//        // Print the graph representation
//        g.printGraph();
//    }
//}
class edge{
    int u,


    //this is an edge object
    edge(int u,int v){
        this.u=u;
        this.v=v;
    }
    }
    class edgelist{
    private Object ArrayList;
    static List<edge>ls= new ArrayList<>();
    public static void add(int u, int v){
        //the list stores the edge object whereas the object stores the u and the v
        ls.add(new edge(u,v));
    }
    public void display(){
        for(edge e: ls){
            System.out.println(e.u+" "e.v);
        }
    }


}
class Graph{
    public static void main(String[]args){
        edgelist el=new edgelist();
        edgelist.add(2,3);

    }
}
