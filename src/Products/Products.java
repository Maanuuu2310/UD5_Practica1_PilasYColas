package Products;

import java.util.Random;

public class Products {

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
        Random random = new Random();
        int randomIndex = random.nextInt(products.length);
        return products[randomIndex];
    }

}
