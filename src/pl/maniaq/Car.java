package pl.maniaq;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Drive car");
    }

    @Override
    public void stop() {
        System.out.println("Overrided method from interface.");
    }
}
