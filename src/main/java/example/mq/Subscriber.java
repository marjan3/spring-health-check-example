package example.mq;

import example.TestableBean;
import org.springframework.stereotype.Component;

@Component
public class Subscriber implements TestableBean {

    public String getName() {
        return "MQ - Subscriber";
    }

    @Override
    public boolean test() {
        return false;
    }
}
