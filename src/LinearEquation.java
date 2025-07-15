public class LinearEquation {


//    LinearEquation le = new LinearEquation(1,2,3,6,5,4);
//        if(le.isSolvable()){
//        System.out.println(le.getX());
//        System.out.println(le.getY());
//    }else
//            System.out.println("The makhraj is 0");







    private int a,b,c,d,e,f;

    LinearEquation(){

    }
    LinearEquation(int a, int b, int c, int d, int e, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public boolean isSolvable(){
        boolean boo;
        if (a * d - b * c == 0)
            boo = false;
        else
            boo = true;
        return boo;
    }

    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }
    public double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }


}
