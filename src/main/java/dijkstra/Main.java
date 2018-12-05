package dijkstra;

public class Main {

    public static void main(String[] args) {
        Path path = new Path("test.txt");
        path.buildGraph();

        Vertex one = path.getSource();
        Vertex eight = path.getDestination();

        System.out.print("Edge Path: " + path.findPath());
        System.out.print("\nString sequence path: " + path.getPathString());
        System.out.println("\nDistance from " + one.getId() + " to " + eight.getId() + " = " + eight.getMinDistance());
    }

}
