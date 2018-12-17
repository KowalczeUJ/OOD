package dijkstra;

public interface PathInterface {

    void buildGraph();
    String findPath(Vertex source, Vertex destination);
    String getPathString(Vertex source, Vertex destination);
}
