
//Cafteria Menu App
//importing Scanner class
import java.util.Scanner;

public class CafeteriaMenuApp {
    public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);
        // user input
        String[] menu = { "Pizza", "Coffee", "Samosa", "Momos", "SoftDrinks", "Tea", "Dhokla", "Sandwich", "Pasta",
                "Maggie" };
                displayMenu(menu);
        System.out.println("enter your menu no.:");
        int choice = sc.nextInt();
        
        getItembyindex(menu, choice);
        // closing input
        sc.close();
    }

    public static void displayMenu(String[] menu)
    {
        for(int i=0; i<menu.length; i++)
        {
            System.out.println("Menu "+(i+1)+" is:"+menu[i]);
        }
    }
    public static void getItembyindex(String[] menu, int choice) {
        System.out.println("Your order:" + menu[choice - 1]);

    }

}