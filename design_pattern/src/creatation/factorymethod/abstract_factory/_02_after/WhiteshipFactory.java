package creatation.factorymethod.abstract_factory._02_after;


import creatation.factorymethod.factory_method._02_after.DefaultShipFactory;
import creatation.factorymethod.factory_method._02_after.Ship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        
//        ship.setAnchor(shipPartsFactory.createAnchor());
//        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
