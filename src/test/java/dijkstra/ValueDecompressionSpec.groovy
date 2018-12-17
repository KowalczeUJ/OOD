package dijkstra

import org.junit.Test
import spock.lang.Specification
import spock.lang.Unroll

class ValueDecompressionSpec extends Specification {

    @Test
    @Unroll
    def "should decompress string=#string to #expected"() {
        given:
            Vertex vertex = new Vertex(1)
            vertex.setValue(string)
        when:
            vertex.setValueLength()
        then:
            vertex.getDecompressedValue() == expected
        where:
            string                  || expected
            "Kes(1x6)k(2x3)"        || "Kessssssksksk"
            "Mon(1x3)dra(2x2)ld"    || "Monnndrarald"
            "Pea(1x3)kd"            || "Peaaakd"
            "Eawe(2x2)d(3x3)"       || "Eawewedwedwed"
            "tysg(2x4)pak(2x2)"     || "tysgsgsgsgpakak"
            "dks(2x5)k(3x2)dk(1x3)" || "dkskskskskskkskdkkk"
    }

}
