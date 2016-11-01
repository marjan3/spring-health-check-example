package example.unit;

import example.healthcheck.CustomHealthIndicator;
import org.junit.Test;
import org.springframework.boot.actuate.health.Health;

import java.util.Arrays;

import static org.junit.Assert.*;



public class CustomHealthIndicatorTest {

    private static CustomHealthIndicator healthIndicator;

    @Test
    public void testHealth_StatusShouldBeOutOfService() throws Exception {
        // given
        healthIndicator = new CustomHealthIndicator(Arrays.asList(() -> {
            return false;
        }));

        // when
        Health health = healthIndicator.health();

        // then
        assertEquals("OUT_OF_SERVICE", health.getStatus().getCode());
    }



    @Test
    public void testHealth_StatusShouldBeUp() throws Exception {
        // given
        healthIndicator = new CustomHealthIndicator(Arrays.asList(() -> {
            return true;
        }));

        // when
        Health health = healthIndicator.health();

        // then
        assertEquals("UP", health.getStatus().getCode());
    }

}