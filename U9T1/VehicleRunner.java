public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle1 myVehicle = new Vehicle1("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car1 myCar = new Car1("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle1 myBike = new Bicycle1("ofo", 2, 10);
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        myBike.move(10);
        myBike.turn();
        myBike.brake();
        myBike.ringBell();
        System.out.println(myBike.getGearCount());

        // myVehicle.ringBell();                          //line 1
        // System.out.println(myVehicle.getGearCount());  //line 2
        // myCar.ringBell();                              //line 3
        // myBike.honk();                                 //line 4
        // myBike.lockDoors();                            //line 5
        
        Bus1 mta = new Bus1("B16", 4, 20, 25, "Fort Hamilton Pkwy/62 St" );
        System.out.println(mta.getName());
        System.out.println(mta.getWheels());
        mta.brake();
        mta.move(20);
        mta.getPassengers();
        mta.getStops();
        mta.stopName();

    }
}