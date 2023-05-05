package Entity;

public class Cashier {

    int cashNum;
    String name;
    ClientQueue clientsQueue = new ClientQueue();

    public Cashier(int cashNum, String name) {
        this.cashNum = cashNum;
        this.name = name;
    }

    public void enqueueClient(Client client){
        clientsQueue.enqueue(client);
    }

    public Client dequeueClient() {
        return clientsQueue.dequeue();
    }

    @Override
    public String toString() {
        String output = "============================================== \n";
        output += "- Caja Nº: " + this.cashNum;
        output += "- Nombre cajero: " + this.name;
        if (clientsQueue.size() > 0) {
            output += "- Total de Clientes " + this.clientsQueue.size();
            output += clientsQueue.toString();
        } else {
            output += "- No hay clientes en esta caja todavía.";
        }
        output += "============================================== \n";
        return output;
    }

}
