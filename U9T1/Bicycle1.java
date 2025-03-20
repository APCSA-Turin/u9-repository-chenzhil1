public class Bicycle1 extends Vehicle1 {
    int gearCount;

    public Bicycle1(String name, int wheels, int gearCount) {
        super(name, wheels);
        this.gearCount = gearCount;

    }

    public void ringBell() {
        System.out.println("*ring ring*");
    }

    public int getGearCount() {
        return gearCount;
    }
}
