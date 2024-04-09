import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        addFoodItem add=new addFoodItem();
        add.addFood("chicken","300","100");
        add.addFood("egg whites","150","200");
        add.addFood("carrot","120","300");
        add.addFood("nuts","200","100");
        add.addFood("beans","90","55");
//        add.display();
//        ArrayList<ArrayList<String>> f=add.foodItem;
//        // Debug print to check if search is called
//
        searchFoodItem s=new searchFoodItem();
//        s.search("beans",f);
//
//
//        // Debug print to check if searchCalories is called
//        System.out.println("Searching for calories 300:");
//        s.searchCalories("300",f);
//        Meal m=new Meal();
//        m.createMeal("2000",f);
        Scanner scc=new Scanner(System.in);
        boolean user=true;
        while(user){
            System.out.println("Enter the user name as Admin");
            String username=scc.nextLine();
            System.out.println("enter the password as password");
            String password=scc.nextLine();
            if(username.equals("Admin") && password.equals("password")){
                user=false;
            }else{
                System.out.println("Provide the correct user details");
            }
        }
        boolean loop=true;
        while(loop){
            System.out.println("Menu");
            System.out.println("1. Add Food");
            System.out.println("2. Delete Food using Food Name");
            System.out.println("3. Delete Food using Calories");
            System.out.println("4. Search Food using Food Name");
            System.out.println("5. Search food using Calories");
            System.out.println("6. Show all available Foods");
            System.out.println("7. Create a meal plan for Your Calories");
            System.out.println("8. Exit");
            Scanner sc=new Scanner(System.in);
            int option=sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("You are now adding a food");
                    System.out.println("To go back to menu press 10");
                    System.out.println("To continue press any other number");
                    int goback=sc.nextInt();
                    sc.nextLine();
                    if(goback==10){
                        break;
                    }else{
                        System.out.println("enter the details");
                    }
                    System.out.println("Enter a Food to add : ");
                    String food=sc.nextLine();
                    System.out.println("Enter a calories of the food  to add : ");
                    String calories=sc.nextLine();
                    System.out.println("Enter a quantity of the food in grams to add : ");
                    String quantity=sc.nextLine();
                    add.addFood(food,calories,quantity);
                    break;
                case 2:
                    System.out.println("You are now deleting a food");
                    System.out.println("To go back to menu press 10");
                    System.out.println("To continue press any other number");
                    int goback1=sc.nextInt();
                    sc.nextLine();
                    if(goback1==10){
                        break;
                    }else{
                        System.out.println("Enter the deatils");
                    }
                    System.out.println("Enter a Food to delete : ");
                    String food1=sc.nextLine();
                    add.deleteFood(food1);
                    break;
                case 3:
                    System.out.println("You are now deleting a food");
                    System.out.println("To go back to menu press 10");
                    System.out.println("To continue press any other number");
                    int goback2=sc.nextInt();
                    sc.nextLine();
                    if(goback2==10){
                        break;
                    }else{
                        System.out.println("Enter the details ");
                    }
                    System.out.println("Enter a calories Food to delete : ");
                    String food2=sc.nextLine();
                    add.deleteFoodCalories(food2);
                    break;
                case 4:
                    System.out.println("You are now seraching a food using food name");
                    sc.nextLine();
                    System.out.println("enter the food name to serach");
                    String f=sc.nextLine();
                    ArrayList<ArrayList<String>> fod=add.foodItem;
                    searchFoodItem se=new searchFoodItem();
                    se.search(f,fod);
                    break;
                case 5:
                    System.out.println("You are now seraching a food using food name");
                    sc.nextLine();
                    System.out.println("enter the food calories to serach");
                    String fi=sc.nextLine();
                    ArrayList<ArrayList<String>> fodd=add.foodItem;
                    searchFoodItem see=new searchFoodItem();
                    see.search(fi,fodd);
                    break;

                case 6:
                    System.out.println("Displaying food items");
                    add.display();
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("whoo !!");
                    System.out.println("You are creating your meal plan");
                    System.out.println("enter your target calories");
                    String cal=sc.nextLine();
                    try {
                        System.out.println("Creating your meal plan");
                        System.out.print("Loading");
                        for (int i = 0; i < 10; i++) {
                            Thread.sleep(150); // Sleep for 200 milliseconds
                            System.out.print("."); // Show loading symbol
                        }
                        System.out.println();
                    } catch (InterruptedException e) {
                        // Handle the interrupted exception
                        e.printStackTrace();
                    }
                    Meal m=new Meal();
                    ArrayList<ArrayList<String>> fix=add.foodItem;
                    m.createMeal(cal,fix);
                    break;
                case 8:
                    System.out.println("You are now leaving the console... ");
                    System.out.println("Bye for a while ... 😢👋");
                    loop = false;
                    break;



            }
        }
    }
}
