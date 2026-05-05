import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PathTest {

    @Test
    @DisplayName("Kiểm tra đường dẫn đa hệ điều hành")
    void testCrossPlatformPathSeparator() {
        String path = Paths.get("target", "test-classes", "data.txt").toString();

        String expectedPath =
                "target" + File.separator + "test-classes" + File.separator + "data.txt";

        System.out.println("Cross-platform path: " + path);

        assertEquals(expectedPath, path);
    }
}