package creatation.factorymethod.abstract_factory.factory_method._03_java;

import com.example.factory_method._02_after.BlackShip;
import com.example.factory_method._02_after.WhiteShip;



public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("balackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
