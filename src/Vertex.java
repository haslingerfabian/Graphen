import java.util.ArrayList;

public class Vertex {
    private int data;
    private ArrayList<Edge> edges;

    public Vertex(int inputData) {
        this.data = inputData;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        this.edges.add(new Edge(this, endVertex, weight));
    }

    public ArrayList<Edge> getEdges(){
        return this.edges;
    }

    public int getData()
    {
        return this.data;
    }

}
