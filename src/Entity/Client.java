package Entity;

public class Client {

    String name;
    ShoppingCart cart;

    public Client(ShoppingCart cart) {
        this.name = "Cliente aleatorio";
        this.cart = cart;
    }

    @Override
    public String toString() {
        String output = "============================================== \n";
        output += "- Nombre cliente: " + this.name + "\n";
        if (cart.size() > 0) {
            output += "- Total de productos: " + this.cart.size() + "\n";
            output += cart.toString();
        } else {
            output += "- No hay elementos en este carro todavía.";
        }
        output += "============================================== \n";
        return output;
    }

}
