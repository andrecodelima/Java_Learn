package application;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Name: " + product.name);
        System.out.println("Price: " + product.price);
        System.out.println("Quantity: " + product.quantity);

        System.out.println("Quantity in stock: " + product.totalValueInStock());
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(product.quantity = sc.nextInt());

        System.out.println("Updated data: ");
        System.out.println("Name: " + product.name);
        System.out.println("Price: " + product.price);
        System.out.println("Quantity: " + product.quantity);

        System.out.println("Quantity in stock: " + product.totalValueInStock());



    }

}
