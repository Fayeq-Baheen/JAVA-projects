public class BMI {

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
