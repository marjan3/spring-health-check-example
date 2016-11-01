package example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hey, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hey")
    public Greeting greeting(@RequestParam(value="name", defaultValue="All") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
