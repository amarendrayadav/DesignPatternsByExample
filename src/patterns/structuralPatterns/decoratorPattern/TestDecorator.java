package patterns.structuralPatterns.decoratorPattern;

public class TestDecorator {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsCar.assemble();
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
    }
}
