package com.example.abstract_factory._02_after;

import com.example.abstract_factory._01_before.WhiteAnchor;
import com.example.abstract_factory._01_before.WhiteWheel;
import com.example.factory_method._02_after.DefaultShipFactory;
import com.example.factory_method._02_after.Ship;
import com.example.factory_method._02_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
