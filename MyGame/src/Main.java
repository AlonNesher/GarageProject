import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    private static ArrayList<Meal> meals = new ArrayList<>();
    private static HashMap<String, Integer> calorieMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Restaurant Game");

        
    // tar in github in src : data and output// letters (long string)
        Meal m1 = new Meal("Toast");
        m1.addIngredient("bread");
        m1.addIngredient("cheese");

        System.out.println(m1.toString());
        Meal m2 = new Meal("pizza");
        m2.addIngredient("Tatmto");
        m2.addIngredient("bread");
        m2.addIngredient("red souce");
        m2.addIngredient("cheese");

        Meal m3 = new Meal("Banolez");
        m3.addIngredient("pasta");
        m3.addIngredient("beef");
        m3.addIngredient("red souse");


        // add meals to
        meals.add(m1);
        meals.add(m2);
        meals.add(m3);


        calorieMap.put("bread", 100);
        calorieMap.put("cheese", 200);
        calorieMap.put("Tatmto", 20);
        calorieMap.put("red souce", 60);
        calorieMap.put("beef", 150);


       for (Meal arr : meals) {
            int sumOfCalorie = calculateCalories(arr);
            System.out.println(arr + "\nCalories:" + sumOfCalorie);
        }

    }

    private static int calculateCalories(Meal meal) {
        int sum = 0;

        // Iterate through the list of ingredients
        for (int i = 0; i < meal.getIngredients().size(); i++) {
            String ingredient = meal.getIngredients().get(i);

            // Retrieve the calorie count for the ingredient from the map
            int calories = calorieMap.getOrDefault(ingredient, 0);

            // Add to the sum
            sum += calories;
        }

        return sum;
    }

}