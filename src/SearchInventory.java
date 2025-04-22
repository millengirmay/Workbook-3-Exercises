import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SearchInventory {

    static class Products {
        private float price;
        private int productNumber;
        private String productName;

        Products(int productNumber, String productName, float price) {
            this.productName = productName;
            this.price = price;
            this.productNumber = productNumber;
        }

        public String getProductName() {
            return productName;
        }

        public float getPrice() {
            return price;
        }

        public int getProductNumber() {
            return productNumber;
        }
    }

       public static void main(String[] args) {
           ArrayList<Products> inventory = getInventory();
           Collections.sort(inventory, Comparator.comparing(Products::getProductName));
           System.out.println("Store Inventory:");
           for(Products p : inventory){
               System.out.println(p.getProductNumber() + " " + p.getProductName() + " " + p.getPrice());
           }
       }
       public static ArrayList<Products> getInventory(){
           ArrayList<Products> inventory = new ArrayList<>();
           inventory.add(new Products(4567,"10' 2x4(grade B)", 9.99f));
           inventory.add(new Products(9846,"Hammer", 19.99f));
           inventory.add(new Products(1468,"Box of nails", 7.69f));
           inventory.add(new Products(6971,"Chocolate", 3.45f));
           inventory.add(new Products(3684,"Tuna", 11.56f));
           return inventory;
     }
   }


