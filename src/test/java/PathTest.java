import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PathTest {

    @Test
    @DisplayName("Cố tình kiểm tra đường dẫn kiểu Windows")
    void testWindowsSpecificPathSeparator() {
        String path = Paths.get("target", "test-classes", "data.txt").toString();

        System.out.println("Generated path: " + path);

        assertTrue(
                path.contains("\\"),
                "Cố tình yêu cầu đường dẫn chứa dấu \\ kiểu Windows");
    }
}