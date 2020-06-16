
package example;

import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
public class ConnectionTest {

    @Inject
    private ConnectionProvider cp;

    @Test
    public void testGetConnection() {
        cp.release(cp.getConnection());
    }
}
