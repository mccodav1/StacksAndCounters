package Module2;

import java.util.NoSuchElementException;

public class LinkedStack<ItemType> {
    private LinearNode<ItemType> top;
    private int n = 0;

    public LinkedStack() {
        top = null;
    }

    public LinkedStack(ItemType data) {
        LinearNode<ItemType> tmp = new LinearNode<>(data);
        top = tmp;
        n++;
    }

    public void push(ItemType item) {
        LinearNode<ItemType> node = new LinearNode<>(item);
        node.setNext(top);
        top = node;
        n++;
    }

    public ItemType peek() {
        return top.getElement();
    }

    public ItemType pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ItemType data = top.getElement();
        top = top.getNext();
        n--;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return n;
    }
}
