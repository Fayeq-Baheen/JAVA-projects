public class PrimeFactors {

    private int[] elements;
    private int size;
    final static int defaultCapacity = 16;

    public PrimeFactors(){
        this(defaultCapacity);
    }
    public PrimeFactors(int capacity){
        elements = new int[capacity];
    }
//    CHECKS WHETHER THE STACK IS EMPTY OR NOT
    public boolean isEmpty(){
        return (size == 0);
    }
//    RETURNS THE TOP VALUE OF STACK
    public int peek(){
        return elements[size - 1];
    }
//    CHECKS WHETHER THE NUMBER IS PRIME OR NOT
    public boolean isPrime(int checkNum){
        boolean checkPrime = true;
        for(int i = 2; i <= checkNum / 2; i++){
            if(checkNum % i == 0) {
                checkPrime = false;
                break;
            }
        }
        return checkPrime;
    }
//    PUSHES A NEW INTEGER INTO STACK
    public void push(int number){
        if(size >= elements.length){
            int temp[] = new int[elements.length + 1];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        while(number != 1){
            for(int i = 2; i <= number; i++){
                if(isPrime(i) && number % i == 0){
                    elements[size] = i;
                    size++;
                    number /= i;
                    break;
                }

            }
        }
    }
//    RETURNS AND REMOVES THE TOP ELEMENT OF THE STACK
    public int pop(){
        return elements[--size];
    }
    public int getSize(){
        return size;
    }
}
