package patterns.creationalPatterns.builderPattern;

public class ComputerBuilderTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder("1TB", "16GB").build();
        Computer computer2 = new Computer.ComputerBuilder("2TB", "16GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}
