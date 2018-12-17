package dijkstra

import spock.lang.Specification

class FileProcessingSpec extends Specification {

    def "should test initial file processing"() {
        given:
            def filename = "test.txt"
            Path path = new Path(filename)
        and:
            List<Vertex> expected = [
                    new Vertex(1, null, 'Li(2x3)sp', 8,'LiLiLisp', Double.POSITIVE_INFINITY),
                    new Vertex(2, null, 'Kes(1x6)k(2x3)', 13, 'Kessssssksksk', Double.POSITIVE_INFINITY),
                    new Vertex(3, null, 'Mon(1x3)dra(2x2)ld', 12, 'Monnndrarald', Double.POSITIVE_INFINITY),
                    new Vertex(4, null, 'lad(3x2)d(1x5)l', 12, 'ladladdddddl', Double.POSITIVE_INFINITY),
                    new Vertex(5, null, 'Pea(1x3)kd', 7, 'Peaaakd', Double.POSITIVE_INFINITY),
                    new Vertex(6, null, 'Eawe(2x2)d(3x3)', 13, 'Eawewedwedwed', Double.POSITIVE_INFINITY),
                    new Vertex(7, null, 'k(1x6)plos(1x2)', 11, 'kkkkkkploss', Double.POSITIVE_INFINITY),
                    new Vertex(8, null, 'tysg(2x4)pak(2x2)', 15, 'tysgsgsgsgpakak', Double.POSITIVE_INFINITY)
            ]
        when:
            path.buildGraph()
        and:
            def result = path.getVertices()
        then:
            expected == result
    }

}
