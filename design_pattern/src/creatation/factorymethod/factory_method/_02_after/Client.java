package creatation.factorymethod.factory_method._02_after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
/*
        Ship whiteship = new WhiteShipFactory().orderShip("whiteship", "jk@email.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "jk@email.com");
        System.out.println(blackship);
*/

        client.print(new WhiteShipFactory(), "whiteShip", "jkLee@mail.com");
        client.print(new BlackShipFactory(), "blackship", "jk@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
