package example.mq;

import example.TestableBean;


public class Publisher implements TestableBean {

    @Override
    public String getName() {
        return "MQ - Publisher";
    }

    @Override
    public boolean test() {
        return false;
    }
}
