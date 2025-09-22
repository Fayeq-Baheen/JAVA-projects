import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String args[]){

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Donuts");
        bakeryList.add("Bread");


        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("Mint");
        vegetableList.add("Garlic");


        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Soda");
        drinksList.add("Coffee");
        drinksList.add("Water");

        groceryList.add(bakeryList);
        groceryList.add(vegetableList);
        groceryList.add(drinksList);

        for(int i = 0; i < 3; i++){
            System.out.println(groceryList.get(i));
        }
    }
}
