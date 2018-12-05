package dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Dijkstra {

    private Dijkstra() {
    }

    static void computePaths(Vertex source) {
        source.setMinDistance((double) source.getValuelength());
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            Vertex unvisited = vertexQueue.poll();

            if (unvisited != null) {
                for (Edge e : unvisited.getAdjacencies()) {
                    Vertex neighbour = e.target;
                    double weight = neighbour.getValuelength();
                    double distanceThroughU = unvisited.getMinDistance() + weight;

                    if (distanceThroughU < neighbour.getMinDistance()) {
                        vertexQueue.remove(neighbour);

                        neighbour.setMinDistance(distanceThroughU);
                        neighbour.setPrevious(unvisited);

                        vertexQueue.add(neighbour);
                    }
                }
            }
        }
    }

    static List<Vertex> getShortestPathTo(Vertex target) {
        List<Vertex> path = new ArrayList<>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.getPrevious())
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }

}
