package Products;

import java.util.Random;

import Entity.ShoppingCart;

public class Products {

    private static Random random = new Random();

    private static String[] products = {
            "Cepillo de dientes",
            "Champú",
            "Silla de oficina",
            "Jabón de manos",
            "Bolígrafo",
            "Cámara fotográfica",
            "Cinta adhesiva",
            "Televisor",
            "Bolsa de deporte",
            "Auriculares inalámbricos",
            "Pañuelos desechables",
            "Tostadora"
    };

    public static String getRandomProduct() {
        int randomIndex = random.nextInt(products.length);
        return products[randomIndex];
    }

    public static ShoppingCart generateRandomShopCart() {
        ShoppingCart toReturnCart = new ShoppingCart();
        for (int i = 0; i < random.nextInt(10) + 1; i++) {
            String randomProduct = getRandomProduct();
            toReturnCart.push(randomProduct);
        }
        return toReturnCart;
    }

}
