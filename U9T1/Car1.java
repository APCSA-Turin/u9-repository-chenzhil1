public class Car1 extends Vehicle1 {
    private String fabric;

    public Car1(String name, int wheels, String fabric) {
        super(name, wheels);
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void honk() {
        System.out.println("Honk honk! Get outta my way!");
    }

    public void lockDoors() {
        System.out.println("Doors Locked, Car Secure");
    }
}