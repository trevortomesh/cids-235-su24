public class StackOfIntegers {

    private int[] elements;
    private int size;

    public static final int DEFAULT_CAPACITY = 16;

    StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }

    StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    public boolean empty(){
        return size == 0;
    }

    public int peek(){
        return elements[size-1];
    }

    public void push(int value){

    }

    public int pop(){
        //size = size-1;
        return elements[--size];
    }

    public int getSize(){
        return size;
    }
}
