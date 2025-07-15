public class QuadraticEquations {

//    QuadraticEquations qr = new QuadraticEquations(3,12,5);
//        System.out.println(qr.getA());
//        System.out.println(qr.getC());
//        System.out.println(qr.getB());
//        System.out.println(qr.getDiscriminant());
//        System.out.println(qr.getRoot1());
//        System.out.println(qr.getRoot2());



    private int a,b,c;


    QuadraticEquations(){

    }
    QuadraticEquations(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant(){
        return (b * b - 4 * a * c);
    }

    public double getRoot1(){
        return ((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
    }
    public double getRoot2(){
        return ((-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);
    }
}
