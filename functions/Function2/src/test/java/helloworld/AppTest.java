package helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testAppReturnsMessage() {
        App app = new App();
        Object result = app.handleRequest(null, null);
        
        assertNotNull(result);
        assertTrue(result.toString().contains("GitHub Actions"));
    }
}
