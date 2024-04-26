import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Graph graph = new Graph(true, false);
        ArrayList list = new ArrayList<>();

        Vertex v0 = new Vertex(0);
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);


        /*graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);

        graph.addEdge(v1,v2,2);
        graph.addEdge(v1,v3,4);
        graph.addEdge(v2,v3,1);
        graph.addEdge(v2,v4,7);
        graph.addEdge(v3,v4,4);*/

        graph.addVertex(v0);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);

        graph.addEdge(v0, v1, 1);
        graph.addEdge(v0, v2, 2);
        graph.addEdge(v0, v3, 3);
        graph.addEdge(v2, v3, 4);
        graph.addEdge(v2, v4, 5);

        System.out.println("Breitensuche: ");
        graph.breadthFirstTraversal(v0);

        System.out.println("\nTiefensuche: ");
        graph.depthFirstTraversal(v0, list);

    }
}