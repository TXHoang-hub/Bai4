import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PathTest {
    @Test
    void testCrossPlatformPath() {
        Path path = Paths.get("target", "test-classes", "data.txt");
        
        System.out.println("Standardized Path: " + path.toString());
        
        assertNotNull(path.toString());
    }
}