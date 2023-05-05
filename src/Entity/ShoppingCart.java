package Entity;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<String> items;

    ShoppingCart() {
        items = new ArrayList<String>(5);
    }

    public int size() {
        return items.size();
    }

    public void push(String name) {
        items.add(name);
    }

    public String pop() {
        return items.remove(items.size() - 1);
    }

    @Override
    public String toString() {
        String output = "Lista de artículos en la cesta: \n";
        for (int i = 0; i < items.size(); i++) {
            output += "\t- " + items.get(i) + "\n";
        }
        return output;
    }

}
