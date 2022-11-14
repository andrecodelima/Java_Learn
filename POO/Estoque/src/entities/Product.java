package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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

    public String toString(){
        return name;
    }
}
