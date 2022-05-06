package creatation.factorymethod.abstract_factory.factory_method._01_before;

public class ShipFactory {
    public static Ship orderShip(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || name.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        preparFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("TT");
        }

        // coloring
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("whiteship");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }



        sendEmailTo(email, ship);
        return ship;
    }



    private static void preparFor(String name) {
        System.out.println(name + "만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "다 만들었습니다.");
    }
}
