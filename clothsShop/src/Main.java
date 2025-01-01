
public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.start();

        Customer client = new Customer();
        client.connect("localhost");
    }
}




