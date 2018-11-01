package pl.maniaq;

public interface Vehicle {
    static void vehicleInfo() {
        System.out.println("Jakies informacje o pojezdzie");
    }

    void drive();

    default void stop() {
        System.out.println("Domyślnie wciskam hamulec");
    };


}
