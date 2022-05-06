package creatation.factorymethod.abstract_factory.factory_method._02_after;

public class BlackShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
