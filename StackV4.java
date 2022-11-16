package Module2;

import java.util.Arrays;
import java.util.EmptyStackException;

// add in default constructor
// add in pop exception

public class StackV4 <Item> {
    private Item[] data;
    private int n = 0;
    
    
    public StackV4() {
        data = (Item[]) new Object[100];   // default constructor
    }
    public StackV4(int cap) {
        data = (Item[]) new Object[cap];    
    }
    
    public boolean isEmpty() {
        return n==0;
    }
    
    public void push(Item item) {
        if(data.length == n)    // if pointer is the length, its beyond the indexes - its full
            resize();
        data[n++] = item;
    }
    
    public Item pop() {
        if (isEmpty()) {
            throw new EmptyStackException();            
        }
        return data[--n];
    }
    
    private void resize() {     // what happens if cap=0? May want to restrict creation of stack with cap=0
        data = Arrays.copyOf(data, data.length*2);
    }
}
