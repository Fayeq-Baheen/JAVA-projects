public class ArrayList {

    public static void main(String args[]){

        java.util.ArrayList<String> food = new java.util.ArrayList<String>();

        food.add("Kachalu");
        food.add("Burger");
        System.out.println(food.get(1));

        food.set(1,"Pizza");
        System.out.println(food.get(1));

        food.remove(1);
        System.out.println(food.get(0));

        food.clear();

    }
}
