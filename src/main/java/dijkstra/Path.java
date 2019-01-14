package dijkstra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
public class Path implements PathInterface {

    @Getter
    private static List<Vertex> vertices = new ArrayList<>();
    private static Map<Integer, List<Integer>> edgeAdjacencies = new HashMap<>();

    private final String filename;

    @Override
    public void buildGraph() {
        String workDirectory = System.getProperty("user.dir");
        File file = new File(workDirectory + "/src/main/java/dijkstra/" + filename);
        Scanner sc = null;

        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sc.useDelimiter("\\Z");

        byte edgesNo = Byte.parseByte(sc.nextLine(), 2);

        Scanner sc2 = null;
        for (int i = 0; i < (int) (edgesNo); i++) {
            sc2 = new Scanner(sc.nextLine());

            if (sc2.hasNext()) {
                List<Integer> neighbourList = new ArrayList<>();
                Vertex vertex = new Vertex(Byte.parseByte(sc2.next(), 2));

                byte neighbours = Byte.parseByte(sc2.next(), 2);

                for (int j = 0; j < (int) neighbours; j++) {
                    neighbourList.add((int) Byte.parseByte(sc2.next(), 2));
                }

                vertices.add(vertex);
                edgeAdjacencies.put(vertex.getId(), neighbourList);
            }
        }
        sc2.close();

        for (int k = 0; k < (int) edgesNo; k++) {
            Vertex v = vertices.get(k);
            v.setValue(sc.nextLine());
            v.setValueLength();

            for (int j = 0; j < v.getAdjacencies().size(); j++) {
                v.getAdjacencies().get(j).setWeight(v.getValuelength());
            }
        }

        for (int m = 0; m < (int) edgesNo; m++) {
            Vertex v = vertices.get(m);

            List<Edge> adjecencies = edgeAdjacencies.get(v.getId()).stream()
                    .map(d -> {
                        Vertex neigh = vertices.get(d - 1);
                        return new Edge(neigh, v.getValuelength());
                    })
                    .collect(toList());
            v.setAdjacencies(adjecencies);
        }
        sc.close();
    }

    @Override
    public String findPath(Vertex source, Vertex destination) {
        Dijkstra.computePaths(source);
        StringBuilder edgePath = new StringBuilder();

        List<Vertex> paths = Dijkstra.getShortestPathTo(destination);
        paths.forEach(p -> {
            edgePath.append(" -> ");
            edgePath.append(p.getId());
        });

        return edgePath.toString();
    }

    @Override
    public String getPathString(Vertex source, Vertex destination) {
        Dijkstra.computePaths(source);
        StringBuilder edgePath = new StringBuilder();

        List<Vertex> paths = Dijkstra.getShortestPathTo(destination);
        paths.forEach(p -> {
            edgePath.append(" -> ");
            edgePath.append(p.getValuelength());
        });

        return edgePath.toString();
    }

}
