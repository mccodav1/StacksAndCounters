package Module2;

import java.util.Arrays;

public class StackV3<Item> {
    private Item[] data;
    private int n = 0;
    
    public StackV3(int cap) {
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
        return data[--n];
    }
    
    private void resize() {     // what happens if cap=0? May want to restrict creation of stack with cap=0
        data = Arrays.copyOf(data, data.length*2);
    }
}
