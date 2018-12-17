package dijkstra;

public class Main {

    public static void main(String[] args) {
        Path path = new Path("test.txt");
        path.buildGraph();

        Vertex one = Path.getVertices().get(0);
        Vertex eight = Path.getVertices().get(7);

        System.out.print("Edge Path: " + path.findPath(one, eight));
        System.out.print("\nString sequence path: " + path.getPathString(one, eight));
        System.out.println("\nDistance from " + one.getId() + " to " + eight.getId() + " = " + eight.getMinDistance());
    }

}
