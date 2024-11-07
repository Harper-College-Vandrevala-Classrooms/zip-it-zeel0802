import java.util.HashMap;
import java.util.List;

public class ZipItAddOn {

    /**
     * Converts two lists into a HashMap, where the first list provides the keys and the second provides the values.
     * If the lists have different sizes or are null, it throws an IllegalArgumentException.
     *
     * @param keys   List of keys for the HashMap
     * @param values List of values for the HashMap
     * @param <K>    Type of keys
     * @param <V>    Type of values
     * @return A HashMap created from the two lists
     */
    public static <K, V> HashMap<K, V> hashmapify(List<K> keys, List<V> values) {
        if (keys == null || values == null) {
            throw new IllegalArgumentException("Both lists must be non-null.");
        }

        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("The lists must have the same size.");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }
}
