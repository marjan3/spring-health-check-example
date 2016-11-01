package example.mq;

import example.TestableBean;
import org.springframework.stereotype.Component;

@Component
public class Publisher implements TestableBean {

    public String getName() {
        return "MQ - Publisher";
    }

    @Override
    public boolean test() {
        return false;
    }
}
