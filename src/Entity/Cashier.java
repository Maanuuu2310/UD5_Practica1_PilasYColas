package Entity;

public class Cashier {

    int cashNum;
    String name;
    ClientQueue clientsQueue = new ClientQueue();

    public Cashier(int cashNum, String name) {
        this.cashNum = cashNum;
        this.name = name;
    }

    public void enqueueClient(Client client) {
        clientsQueue.enqueue(client);
    }

    public Client dequeueClient() {
        return clientsQueue.dequeue();
    }

    public String getName() {
        return name;
    }

    public boolean isThereClients() {
        return clientsQueue.size() >= 1;
    }

    @Override
    public String toString() {
        String output = "\n ============================================== \n";
        output += "- Caja Nº: " + this.cashNum + "\n";
        output += "- Nombre cajero: " + this.name + "\n";
        if (clientsQueue.size() > 0) {
            output += "- Total de Clientes " + this.clientsQueue.size() + "\n";
            output += clientsQueue.toString();
        } else {
            output += "- No hay clientes en esta caja todavía." + "\n";
        }
        output += "============================================== \n";
        return output;
    }

}
