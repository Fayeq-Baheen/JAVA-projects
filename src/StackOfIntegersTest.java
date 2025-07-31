public class StackOfIntegersTest {
    public static void main(String args[]){

        StackOfIntegers soi = new StackOfIntegers();
        for(int i = 1; i < 10; i++)
            soi.push(i);
        while(!soi.isEmpty())
            System.out.println(soi.pop());
    }
}
