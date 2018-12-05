package dijkstra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Vertex implements Comparable<Vertex> {

    private final int id;
    private Vertex previous;
    private String value;
    private int valuelength;
    private double minDistance = Double.POSITIVE_INFINITY;
    private List<Edge> adjacencies = new ArrayList<>();

    Vertex(int id) {
        this.id = id;
    }

    void setValueLength() {
        this.valuelength = computeValueLength();
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(minDistance, o.minDistance);
    }

    private int computeValueLength() {
        char[] chars = value.toCharArray();
        StringBuilder builder = new StringBuilder();

        int offset;
        int multiplier;

        for (int index = 0; index < chars.length; index++) {
            if (chars[index] != '(') {
                if (chars[index] != ')') {
                    builder.append(chars[index]);
                }
            }
            else {
                String repeated;

                index += 1;
                offset = value.charAt(index) - '0';

                if (builder.length() == offset) {
                    index += 2;
                    multiplier = value.charAt(index) - '0';

                    repeated = new String(new char[multiplier - 1]).replace("\0", builder);
                    builder.append(repeated);
                } else {
                    index += 2;
                    multiplier = value.charAt(index) - '0';

                    int startIndex = builder.length() - offset;
                    repeated = new String(new char[multiplier - 1]).replace("\0", builder.substring(startIndex, startIndex + offset));
                    builder.append(repeated);
                }
            }
        }
        return builder.length();
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id=" + id +
                ", previous=" + previous +
                ", value='" + value + '\'' +
                ", valueLength='" + valuelength + '\'' +
                ", minDistance=" + minDistance +
                ", adjacencies=" + adjacencies +
                '}';
    }

}
