package example.healthcheck;

import example.TestableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    private Collection<TestableBean> testables;

    @Autowired
    public CustomHealthIndicator(Collection<TestableBean> testables){
        this.testables = testables;
    }


    @Override
    public Health health() {

        Status status = Status.UP;

        // test third-party services
        for (TestableBean testable:testables) {
            if(!testable.test())
                status = Status.OUT_OF_SERVICE;
        }

        return Health.status(status).build();
    }
}
