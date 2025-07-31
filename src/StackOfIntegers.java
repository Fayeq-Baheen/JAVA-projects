public class StackOfIntegers {

    private int[] elements;
    private int size;
    final static int defaultCapacity = 16;

    public StackOfIntegers(){
        this(defaultCapacity);
    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }
//    TESTS WHETHER THE STACK IS EMPTY OR NOT
    public boolean isEmpty(){
        return (size == 0);
    }
//    RETURNS THE LAST INDEX'S' VALUE
    public int peek(){
        return elements[size - 1];
    }
//    PUSH A NEW INTEGER INTO THE TOP OF THE STACK
    public void push(int number){
        if(size >= elements.length){
            int temp[] = new int[elements.length + 1];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size] = number;
        size++;
    }
//    RETURNS AND REMOVES THE TOP ELEMENT OF STACK
    public int pop(){
        return elements[--size];
    }
    public int getSize(){
        return size;
    }
}