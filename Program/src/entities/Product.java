package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) { // ISSO AQUI E UM CONSTRUTOR
        this.name= name;
        this.price = price;
        this.quantity = quantity;
    }
    /*Vamos criar um contrutor opcional, o qual recebe apenas nome e preço do produto. A quantidade em estoque deste novo
        produto, por padrão, é zero.

        È possivel tbm incluir um construtor pedrão. */

    public Product(String name, double price) { // ISSO AQUI E UM CONSTRUTOR
        this.name= name;
        this.price = price;
        
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
