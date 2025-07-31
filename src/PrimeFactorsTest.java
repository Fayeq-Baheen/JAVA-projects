public class PrimeFactorsTest {
    public static void main(String args[]){

        PrimeFactors pf = new PrimeFactors();
        pf.push(120);
        while(!pf.isEmpty())
            System.out.println(pf.pop());
    }
}
