package example.mq;

import example.TestableBean;


public class Subscriber implements TestableBean {

    @Override
    public String getName() {
        return "MQ - Subscriber";
    }

    @Override
    public boolean test() {
        return false;
    }
}
