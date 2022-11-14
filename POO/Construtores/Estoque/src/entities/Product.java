package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){ // Por convenção, os argumentos dos construtores tem os mesmos nomes dos atributos.

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    public Product(String name, double price){ // Por convenção, os argumentos dos construtores tem os mesmos nomes dos atributos.

        this.name = name;
        this.price = price;
    }

    public void setName(String name){

    }

    public double totalValueInStock(){

        return price * quantity;

    }

    public void addProducts(int quantity){
            this.quantity += quantity;
            //Soma o quantity que veio como argumento com o quantity
            // da classe representado pelo this.
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

}
