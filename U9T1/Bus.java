public class Bus extends Vehicle {
    private int passengers;
    private int stops;
    private String stopName;

    public Bus(String name, int wheels, int passengers, int stops, String stopName) {
        super(name, wheels);
        this.passengers = passengers;
        this.stops = stops;
        this.stopName = stopName;
    }
    public void getPassengers() {
        System.out.println("There is total " + passengers +" on board");
    }

    public void getStops() {
        System.out.println("This bus have " + stops + " stops");
    }

    public void stopName() {
        System.out.println("\"" + stopName + "\" Station" );
    }
    
}
