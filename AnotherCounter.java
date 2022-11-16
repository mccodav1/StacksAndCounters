package Module2;

public class AnotherCounter implements IncrementCounter{

    private String counter;
    private final String identifier;
    
    public AnotherCounter(String id) {
        counter = "";
        identifier = id;
    }
    
    @Override
    public void increment() {
        counter += "x";
    }

    @Override
    public int tally() {
        return counter.length();
    }
    
    @Override
    public String toString() {
        return (counter.length() + " " + identifier);
    }
}
