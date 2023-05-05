import java.util.Scanner;

import Entity.Cashier;
import Entity.Client;
import Entity.ShoppingCart;
import Products.Products;

public class App {
    public static void main(String[] args) throws Exception {

        boolean exit = false;
        boolean boxOpen = false;
        Cashier newCashier = new Cashier(69, "Adrián");
        Scanner keyboard = new Scanner(System.in);

        while (!exit) {
            System.out.print("\n Bienvenido cajero Dº " + newCashier.getName() + " seleccione una opción.\n");

            System.out.println("1. Abrir la caja.");
            System.out.println("2. Añadir un nuevo cliente.");
            System.out.println("3. Atender un cliente.");
            System.out.println("4. Mi perfil");
            System.out.println("5. Salir");

            System.out.print("\nSelección: ");

            switch (keyboard.nextInt()) {
                case 1:
                    if (boxOpen) {
                        System.out.println("La caja ya está abierta!");
                    } else {
                        boxOpen = true;
                        System.out.println("Abriendo la caja...");
                    }
                    break;
                case 2:
                    if (boxOpen) {
                        System.out.println("Añadiendo un nuevo cliente... ");
                        Client newClient = new Client(Products.generateRandomShopCart());
                        newCashier.enqueueClient(newClient);
                        System.out.println("Se ha añadido al cliente: \n" + newClient);
                    } else {
                        System.out.println("No se ha abierto la caja");
                    }
                    break;
                case 3:
                    if (newCashier.isThereClients()) {
                        System.out.println("Atendiendo al primer cliente: \n" + newCashier.dequeueClient());
                    } else {
                        System.out.println("No hay clientes!!");
                    }
                    break;
                case 4:
                    System.out.println("Información general del cajero actual: \n" + newCashier);
                    break;
                case 5:
                    boxOpen = false;
                    exit = true;
                    System.out.println("Saliendo del supermercado...");
                    break;
                default:
                    System.err.println("ERROR: Opción no reconocida");
                    break;
            }
        }
        keyboard.close();
    }
}
