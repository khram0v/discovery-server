package io.github.khram0v.discoveryserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DiscoveryServerApplicationTests {

    @Test
    void contextLoads() {
        // verifies the Eureka server autoconfiguration wires up cleanly
    }
}
