package Module2;
// An improved stack as seen in Module 2 utilizing Generics
public class FixedCapacityStack<Item> {
    private Item[] data;
    private int n = 0;
    
    public FixedCapacityStack(int cap) {
        data = (Item[]) new Object[cap];
    }
    
    public boolean isEmpty() {
        return n==0;
    }
    
    public void push(Item item) {
        data[n++] = item;
    }
    
    public Item pop() {
        return data[--n];
    }
}
