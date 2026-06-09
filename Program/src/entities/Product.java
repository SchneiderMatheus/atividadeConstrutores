package entities;

public class Product {
    String name;
    private double price;
    private int quantity;

    public Product(){
    }

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

    public void setName(String name){ // permite alterar o name
        this.name = name;
    }
    public String getName(){ // permite pegar o nome
        return name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){ // permite alterar o price
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
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
