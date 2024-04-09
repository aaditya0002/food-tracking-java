import java.util.ArrayList;

public class Meal {
    public void createMeal(String calories, ArrayList<ArrayList<String>> f) {
        ArrayList<ArrayList<String>> mealPlan = new ArrayList<>();
        double totalCalories = Double.parseDouble(calories);

        // Iterate through food items to find suitable foods for the given calories
        for (ArrayList<String> food : f) {
            double foodCalories = Double.parseDouble(food.get(1));
            double total=totalCalories/3;
            double quantity = total / foodCalories;

            // If the quantity is greater than 0, add the food to the meal plan
            if (quantity > 0) {
                ArrayList<String> mealItem = new ArrayList<>();
                mealItem.add(food.get(0)); // Add food name
                mealItem.add(food.get(1)); // Add food calories
                mealItem.add(String.format("%.2f", quantity)); // Add calculated quantity
                mealPlan.add(mealItem);
                totalCalories -= quantity * foodCalories;
            }

            // Break the loop if total calories become less than or equal to 0
            if (totalCalories <= 0) {
                break;
            }
        }

        // Output the generated meal plan
        System.out.printf("%-15s %-15s %-15s\n", "Food", "Calories", "Quantity");

        // Print each row of the table
        for (ArrayList<String> row : mealPlan) {
            System.out.printf("%-15s %-15s %-15s\n", row.get(0), row.get(1), row.get(2));
        }
        System.out.println();
    }
}
