package Module2;
// A basic stack as seen in Module 2
public class FixedCapacityStringStack {
    private String[] data;
    private int n = 0;
    
    public FixedCapacityStringStack (int cap) {
        data = new String[cap];
    }
    
    public boolean isEmpty() {
        return n==0;
    }
    
    public void push(String item) {
        data[n++] = item;
    }
    
    public String pop() {
        return data[--n];
    }
}
