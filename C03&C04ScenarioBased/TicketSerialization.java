import java.io.*;
import java.util.*;

class Ticket implements Serializable {
    int ticketId;
    String eventName;
    double price;

    Ticket(int id, String name, double price) {
        this.ticketId = id; this.eventName = name; this.price = price;
    }
}

public class TicketSerialization {
    public static void main(String[] args) {
        List<Ticket> tickets = Arrays.asList(
            new Ticket(1, "Concert", 1200),
            new Ticket(2, "Theatre", 800),
            new Ticket(3, "Expo", 500),
            new Ticket(4, "Fair", 300)
        );

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tickets.ser"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("tickets.ser"))) {

            out.writeObject(tickets);
            System.out.println("Tickets serialized successfully.");

            List<Ticket> list = (List<Ticket>) in.readObject();
            for (Ticket t : list)
                System.out.println(t.eventName + " - ₹" + t.price);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}