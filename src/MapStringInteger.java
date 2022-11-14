import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapStringInteger {

    private final Map<String, Integer> pairs = new HashMap<>();

    public void addPair(String str, Integer number) {
        if (Objects.equals(pairs.put(str, number), number)) {
            throw new IllegalArgumentException("Значения совпадают");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : pairs.entrySet()) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append('\n');
        }
        return sb.toString();
    }
}
