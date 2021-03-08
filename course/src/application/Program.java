package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Enter product data");
        
        System.out.println("Name: ");
        String name = sc.nextLine();
        
        System.out.println("Price: ");
        double price = sc.nextDouble();
        
        Product product = new Product(name, price);
        
        product.setName("computer");
        System.out.println("nome atualizado :" + product.getName());
        
        product.setPrice(200);
        System.out.println("preco atualizado: " + product.getPrice());
    
       // System.out.println("product data " + product.getPrice());
        
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        
        product.addProduct(quantity);
        
        System.out.println("Updated data " + product);
        
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        
        System.out.println("Updated data " + product);
        
    sc.close();    
    }
    
}
