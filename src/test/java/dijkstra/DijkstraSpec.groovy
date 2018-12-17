package dijkstra

import spock.lang.Specification
import spock.lang.Unroll

class DijkstraSpec extends Specification {

    @Unroll
    def "should get string distance from vertex id=#source to id=#destination"() {
        given:
            Path path = new Path("test.txt")
            path.buildGraph()
        and:
            def vertices = Path.getVertices()
        and:
            def sourceVertex = vertices.get(source - 1)
            def destinationVertex = vertices.get(destination - 1)
        when:
            path.findPath(sourceVertex, destinationVertex)
        then:
            destinationVertex.getMinDistance() == expectedDistance
        where:
            source  | destination   || expectedDistance
            1       | 5             || 28
            1       | 8             || 35
            1       | 3             || 32
            1       | 6             || 34
            2       | 7             || 31
    }
}
