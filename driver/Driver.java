package driver;

public class Driver {

    public static void connected_write_info(String info) {
        String compositeString = String.format("Prefix of string, %s", info);
        System.err.printf("String is: %s", compositeString);
    }

    static void driver_write_info() {
        String userInput = System.console().readLine();
        System.err.printf("User input: %s", userInput);
    }
}