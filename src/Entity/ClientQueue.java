package Entity;

import java.util.ArrayList;

public class ClientQueue {

    ArrayList<Client> clients;

    ClientQueue() {
        clients = new ArrayList<Client>(5);
    }

    public void enqueue(Client client) {
        clients.add(client);
    }

    public Client dequeue() {
        return clients.remove(0);
    }

    public int size() {
        return clients.size();
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < this.size(); i++) {
            output += "\t- " + clients.get(i) + "\n";
        }
        return output;
    }
    
}
