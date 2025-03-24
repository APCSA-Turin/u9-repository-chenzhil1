package U9T5;
import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients = new ArrayList<Animal>();

    public Vet(String vetName) {
        this.vetName = vetName;
    }

    public boolean addClient(Animal client) {
        if(clients.indexOf(client) < 0) {
            clients.add(client);
            System.out.println("Welcome to " + vetName + " office, " + client.getName());
            return true;
        }
        else {
            System.out.println(client.getName() + " is already a client of " + vetName);
            return false;
        }
    }

    public void printClientList() {
        for(Animal client : clients) {
            System.out.println(client.getName() + ": class " + client.getClass());
        }
    }
 }
