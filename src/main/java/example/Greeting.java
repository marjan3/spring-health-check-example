package example;

public class Greeting {

    private String name;
    private long inc;

    public Greeting(long inc, String name) {
        this.inc = inc;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getInc() {
        return inc;
    }

    public void setInc(long inc) {
        this.inc = inc;
    }
}
