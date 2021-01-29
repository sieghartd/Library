package model;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {

        if ("Book".equalsIgnoreCase(choice)) {
            return new BookFactory();
        } else
            return null;
    }
}
