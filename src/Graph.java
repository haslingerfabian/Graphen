import java.util.*;

public class Graph
{
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }

    public Vertex addVertex(Vertex v) {
        this.vertices.add(v);
        return v;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }
        vertex1.addEdge(vertex2, weight);
        if (!this.isDirected) {
            vertex2.addEdge(vertex1, weight);
        }
    }

    public void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
        System.out.println(start.getData());
        visitedVertices.add(start);

        for(Edge e : start.getEdges()) {
            Vertex temp = e.getEnd();
            if(!visitedVertices.contains(temp)) {
                visitedVertices.add(temp);
                depthFirstTraversal(temp, visitedVertices);
            }
        }
    }

    public void breadthFirstTraversal(Vertex start) {
        ArrayList<Vertex> visitedVertices = new ArrayList<Vertex>();
        visitedVertices.add(start);

        Queue<Vertex> visitQueue = new LinkedList<>();
        visitQueue.add(start);
        while (!visitQueue.isEmpty()) {
            Object current = visitQueue.remove();
            System.out.println(((Vertex) current).getData());
            for(Edge e : ((Vertex) current).getEdges()) {
                Vertex neighbor = e.getEnd();
                if(!visitedVertices.contains(neighbor)) {
                    visitedVertices.add(neighbor);
                    visitQueue.add(neighbor);
                }
            }
        }
    }

}
