import java.util.ArrayList;

public class Meal {

    private String name;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Meal(String name) {
        this.name = name;
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        StringBuilder arr = new StringBuilder();

        // Assuming 'ingredients' is a List<String> or String[]
        for (String ingredient : ingredients) {
            arr.append(ingredient).append(", ");
        }

        // Remove the trailing comma and space, if necessary
        if (arr.length() > 0) {
            arr.setLength(arr.length() - 2);
        }

        return "\nname=" + name + ' ' +
                ", ingredients=" + arr.toString();
    }
}
