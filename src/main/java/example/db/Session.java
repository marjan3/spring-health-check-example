package example.db;

import example.TestableBean;
import org.springframework.stereotype.Component;

@Component
public class Session implements TestableBean {

    @Override
    public String getName() {
        return "DB - Session";
    }

    public boolean test(){
        return false;
    }
}
