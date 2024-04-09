import java.util.ArrayList;

public class searchFoodItem {
    addFoodItem foods = new addFoodItem();

    public void search(String food, ArrayList<ArrayList<String>> f ) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (ArrayList<String> i : f) {
            if (i.get(0).equals(food)) {
                res.add(i);
            }
        }
        display(res);
//        return res;
    }

    public void searchCalories(String calories, ArrayList<ArrayList<String>> f ) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (ArrayList<String> i : f) {
            if (i.get(1).equals(calories)) {
                res.add(i);
            }
        }
        display(res);
    }

    public void display(ArrayList<ArrayList<String>> x) {
        System.out.printf("%-15s %-15s %-15s\n", "Food", "Calories", "Quantity");

        // Print each row of the table
        for (ArrayList<String> row : x) {
            System.out.printf("%-15s %-15s %-15s\n", row.get(0), row.get(1), row.get(2));
        }
        System.out.println();
    }
}
