public class Edge
{
    private Vertex v1;
    private Vertex v2;
    private int weight;

    public Edge(Vertex v1, Vertex v2, int weight)
    {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public Vertex getStart() {
        return this.v1;
    }

    public Vertex getEnd() {
        return this.v2;
    }

    public Integer getWeight() {
        return this.weight;
    }
}
