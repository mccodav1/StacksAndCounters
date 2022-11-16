package Module2;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

// finalized stack, implementing Iterable

public class Stack <Item> implements Iterable<Item>{        // new from V4
    private Item[] data;
    private int n = 0;
    
    
    public Stack() {
        data = (Item[]) new Object[100];   // default constructor
    }
    public Stack(int cap) {
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
    
    @Override
    public Iterator<Item> iterator(){          // new from V4
        return new ReverseArrayIterator();
    }
    
    private class ReverseArrayIterator implements Iterator<Item>{   // new from V4
        private int i = n;
        public boolean hasNext() { return i > 0; }
        public Item next() {return data[--i];}
        public void remove() {}     // blank because we can't remove from inside a stack
    }
}
