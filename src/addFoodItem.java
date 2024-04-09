import java.util.ArrayList;

public class addFoodItem {
    private String food;
    private String calories;
    private String quantity;
    ArrayList<ArrayList<String>> foodItem = new ArrayList<>();

    public void addFood(String food, String calories, String quantity) {
        ArrayList<String> f = new ArrayList<>();
        f.add(food);
        f.add(calories);
        f.add(quantity);
        foodItem.add(f);
    }

    public void deleteFood(String food) {
        ArrayList<ArrayList<String>> toRemove = new ArrayList<>();
        for (ArrayList<String> innerList : foodItem) {
            if (innerList.get(0).equals(food)) {
                toRemove.add(innerList);
            }
        }
        foodItem.removeAll(toRemove);
    }

    public void deleteFoodCalories(String calories) {
        ArrayList<ArrayList<String>> toRemove = new ArrayList<>();
        for (ArrayList<String> innerList : foodItem) {
            if (innerList.get(1).equals(calories)) {
                toRemove.add(innerList);
            }
        }
        foodItem.removeAll(toRemove);
    }

    public void display() {
        System.out.printf("%-15s %-15s %-15s\n", "Food", "Calories", "Quantity");

        // Print each row of the table
        for (ArrayList<String> row : foodItem) {
            System.out.printf("%-15s %-15s %-15s\n", row.get(0), row.get(1), row.get(2));
        }
        System.out.println();
    }
}
