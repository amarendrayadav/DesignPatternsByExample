package patterns.behaviouralPatterns.decoratorPattern;

public class TestDecorator {
    public static void main(String[] args) {
        SportsCar car = new SportsCar(new LuxuryCar(new BasicCar()));
        car.assemble();
    }
}
