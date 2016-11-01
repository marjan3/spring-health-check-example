package example.db;

import example.TestableBean;
import org.springframework.stereotype.Component;

@Component
public class DbClient implements TestableBean {

    public String getName() {
        return "DB - Client";
    }

    public boolean test(){
        return false;
    }
}
