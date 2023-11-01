import java.util.*;
import java.lang.*;


public class InventoryManager {
    private ArrayList <Inventoryitem> inventory;

    public InventoryManager(){
        inventory = new ArrayList<>();

    }
    public void addItem(Inventoryitem item){
        inventory.add(item);
    }

    public void removeItem(Inventoryitem item){
        inventory.remove(item);
    }
    public void updateQuantity(String productName, int newQuantity){
        for(Inventoryitem item : inventory){
            if(item.getProductName().equals(productName)){
                item.setQuantity(newQuantity);
                break;
            }
        }
    }
    public void printInventoryReport(){
         for(Inventoryitem item : inventory){
             System.out.println("Product : "+ item.getProductName());
             System.out.println("quantity : "+ item.getQuantity());
             System.out.println("Price : $"+ item.getPrice());
             System.out.println("TotalValue: $"+item.getQuantity() * item.getPrice());
             System.out.println();

         }
    }
}
