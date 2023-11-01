import java.util.*;
import java.lang.*;


public class InventorySystem {
    public static void main(String[] args){
        InventoryManager inventoryManager = new InventoryManager();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("INVENTORY MANAGEMENT SYSTEM : ");
            System.out.println("1. Add item");
            System.out.println("2. Update quantity");
            System.out.println("3. Print Inventory Report");
            System.out.println("4. Exit");
            System.out.println("Select one option : ");

            int option = input.nextInt();
            input.nextLine();

            switch(option){
                case 1:
                    System.out.println("Enter product name: ");
                    String name = input.nextLine();
                    System.out.println("Enter Quantity: ");
                    int quantity = input.nextInt();
                    System.out.println("Enter Price: ");
                    double price = input.nextDouble();
                    inventoryManager.addItem(new Inventoryitem(name,quantity,price));
                    break;

                case 2:
                    System.out.println("Enter Product Name: ");
                    String productName = input.nextLine();
                    System.out.println("Enter new quantity: ");
                    int newQuantity = input.nextInt();
                    inventoryManager.updateQuantity(productName,newQuantity);

                case 3:
                    inventoryManager.printInventoryReport();
                    break;

                case 4:
                    System.out.println("Exiting.....");
                    System.out.println(0);

                default:
                    System.out.println("Invalid option. Please select a valid option...!");
            }
        }
    }
}
