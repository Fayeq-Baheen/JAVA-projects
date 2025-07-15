public class BMI {
//    MAIN
//    BMI ahmad = new BMI("Ahmad",15,57,1.7);
//        System.out.println(ahmad.getName());
//        System.out.println(ahmad.getBMI());
//        System.out.println(ahmad.getStatus());
//
//    BMI karim = new BMI("Karim", 20, 54, 1.67);
//        System.out.println(karim.getName());
//        System.out.println(karim.getBMI());
//        System.out.println(karim.getStatus());




    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public BMI(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI(){
        double bmi = weight / (height * height);
        return bmi;
    }
    public String getStatus(){
        double bmi = getBMI();
        if(bmi < 16)
            return "Seriously underweight";
        else if(bmi < 18)
            return "Underweight";
        else if(bmi < 24)
            return "normal";
        else if(bmi < 29)
            return "overweight";
        else if(bmi < 35)
            return "Seriously overweight";
        else
            return "fuck you";
    }












}
