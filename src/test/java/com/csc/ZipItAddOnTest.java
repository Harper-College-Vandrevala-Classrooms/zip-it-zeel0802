import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ZipItAddOnTest {

    @Test
    public void testHashmapifyValidInput() {
        List<String> keys = List.of("Key1", "Key2");
        List<Integer> values = List.of(10, 20);
        HashMap<String, Integer> result = ZipItAddOn.hashmapify(keys, values);

        assertEquals(2, result.size());
        assertEquals(10, result.get("Key1"));
        assertEquals(20, result.get("Key2"));
    }

    @Test
    public void testHashmapifyDifferentSizeLists() {
        List<String> keys = List.of("Key1");
        List<Integer> values = List.of(10, 20);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ZipItAddOn.hashmapify(keys, values);
        });
        assertEquals("The lists must have the same size.", exception.getMessage());
    }

    @Test
    public void testHashmapifyWithNullLists() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ZipItAddOn.hashmapify(null, null);
        });
        assertEquals("Both lists must be non-null.", exception.getMessage());
    }

    @Test
    public void testHashmapifyEmptyLists() {
        List<String> keys = List.of();
        List<Integer> values = List.of();
        HashMap<String, Integer> result = ZipItAddOn.hashmapify(keys, values);

        assertTrue(result.isEmpty(), "Expected empty HashMap for empty input lists.");
    }
}
