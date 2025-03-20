public class Vehicle1 {
    private String name;
    private int wheels;

    public Vehicle1(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void move(int distance) {
        System.out.println("I just moved " + distance + "!");
    }

    public void turn() {
        System.out.println("I just turned");
    }

    public void brake() {
        System.out.println("I just braked");
    }
}