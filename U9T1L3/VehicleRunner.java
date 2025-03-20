public class VehicleRunner {
    public static void main(String[] args) {
        // // -------------- LAB PART 1 -----------------
        // // a. write code to create a Vehicle object with license "MC56WQ",
        // //    toll fee of 10.75, and 5 passengers.
        // //    Print out the calculated toll TollPrice.

        // Vehicle a = new Vehicle("MC56WQ", 10.75, 5);
        // System.out.println(a.calculateTollPrice());



        // // b. write code to create an electric Car with license "KXN73F",
        // //    toll fee of 8.50, and 2 passengers.
        // //    Print out the calculated toll price

        // Car b = new Car("KXN73F", 8.50, 2, true);
        // System.out.println(b.calculateTollPrice());




        // // c. add a printCar() void method to the Car class that prints the
        // //    Car's license plate, toll fee, number of passengers, whether it is electric,
        // //    and whether a discount has been applied.
        // //
        // // d. call the method on the Car you made in c to test it.

        // b.printCar();



        // // e. write code to create a Truck with license "3K9JMX",
        // //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        // //    Print out the calculated toll price

        // Truck e = new Truck("3K9JMX", 24.75, 4, 6, true);
        // System.out.println(e.calculateTollPrice());



        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //
        // g. call the method on the Truck you made in e to test it.




        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------

        // Taxi myTaxi = new Taxi("NOTTAXI", 7.91, 2, true, 7.91);
        // myTaxi.printTaxi();


        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------

        // System.out.println("--- Testing method on a Car object ---");
        // Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        // System.out.println(testCar1.getPassengers());
        // System.out.println("-----------");
        // boolean success = testCar1.dropOffPassengers(3);
        // System.out.println(success);
        // System.out.println(testCar1.getPassengers());
        // System.out.println("-----------");
        // success = testCar1.dropOffPassengers(3);
        // System.out.println(success);
        // System.out.println(testCar1.getPassengers());
        // System.out.println("--- Testing method on a Taxi object ---");
        // Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
        // System.out.println(testTaxi1.getPassengers());
        // System.out.println("-----------");
        // success = testTaxi1.dropOffPassengers(3);
        // System.out.println(success);
        // System.out.println(testTaxi1.getPassengers());
        // System.out.println("-----------");
        // success = testTaxi1.dropOffPassengers(2);
        // System.out.println(success);
        // System.out.println(testTaxi1.getPassengers());
        // System.out.println("-----------");
        
        // Car myCar = new Car("NUMBCAR", 14.75, 4, true);
        // Taxi myTaxi = new Taxi("NOTATAXI", 9.81, 3, false, 15);
        // System.out.println(myCar.dropOffPassengers(2));
        // System.out.println(myCar.getPassengers());
        // System.out.println(myTaxi.dropOffPassengers(3));
        // System.out.println(myTaxi.getPassengers());
        // System.out.println(myTaxi.dropOffPassengers(1));
        // System.out.println(myTaxi.getPassengers());

        // System.out.println("--- Testing method on a Car object ---");
        // Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        // testCar1.applyDiscount();
        // System.out.println(testCar1.isDiscountApplied());
        // System.out.println(testCar1.getTollFee());
        // System.out.println("-----------");
        // testCar1.applyDiscount(); // try applying again
        // System.out.println(testCar1.isDiscountApplied());
        // System.out.println(testCar1.getTollFee());
        // System.out.println("--- Testing method on Taxi objects ---");
        // Taxi testTaxi1 = new Taxi("JMD645", 10.0, 3, false, 5.0); // not electric
        // testTaxi1.applyDiscount();
        // System.out.println(testTaxi1.isDiscountApplied());
        // System.out.println(testTaxi1.getTollFee());
        // System.out.println("-----------");
        // Taxi testTaxi2 = new Taxi("ABC645", 12.0, 3, true, 5.0);
        // testTaxi2.applyDiscount();
        // System.out.println(testTaxi2.isDiscountApplied());
        // System.out.println(testTaxi2.getTollFee());
        // System.out.println("-----------");

        // System.out.println("--- Testing method on Truck objects ---");
        // Truck testTruck1 = new Truck("7645MX", 10.50, 3, 7, true);
        // boolean validLicensePlate = testTruck1.validateLicensePlate();
        // System.out.println(validLicensePlate);
        // System.out.println("-----------");
        // Truck testTruck2 = new Truck("7645PX", 10.50, 3, 7, true);
        // validLicensePlate = testTruck2.validateLicensePlate();
        // System.out.println(validLicensePlate);
        // System.out.println("-----------");
        // Truck testTruck3 = new Truck("7645LX", 10.50, 3, 4, true);
        // validLicensePlate = testTruck3.validateLicensePlate();
        // System.out.println(validLicensePlate);
        // System.out.println("-----------");
        // Truck testTruck4 = new Truck("7645L9", 10.50, 3, 4, true);
        // validLicensePlate = testTruck4.validateLicensePlate();
        // System.out.println(validLicensePlate);
        // System.out.println("-----------");
        // Truck testTruck5 = new Truck("7645L9", 10.50, 3, 4, false);
        // validLicensePlate = testTruck5.validateLicensePlate();
        // System.out.println(validLicensePlate);
        // System.out.println("-----------");
        // Truck testTruck6 = new Truck("7645PX", 10.50, 3, 7, false);
        // validLicensePlate = testTruck6.validateLicensePlate();
        // System.out.println(validLicensePlate);

        // System.out.println("--------- TEST 1 ---------");
        // System.out.println("---- non-electric Taxi ---");
        // System.out.println("--------------------------");
        // Taxi t1 = new Taxi("JMD645", 10.0, 1, false, 5.0); // not electric
        // t1.applyDiscount();
        // System.out.println("discount already applied? " + t1.isDiscountApplied());
        // System.out.println("toll fee: " + t1.getTollFee());
        // System.out.println("total fare collected: " + t1.getFareCollected());
        // System.out.println("total passengers: " + t1.getPassengers());
        // if (!t1.isDiscountApplied() && t1.getTollFee() == 10.0 && t1.getFareCollected() == 5.0 && t1.getPassengers() == 1) {
        //   System.out.println("------------------------ TEST 1a PASS!");
        // } else {
        //   System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1a FAIL!!!!!!!!!!!!!!!!!! ---");
        // }
        // t1.pickupRiders(2, 3.75);
        // System.out.println("discount already applied? " + t1.isDiscountApplied());
        // System.out.println("toll fee: " + t1.getTollFee());
        // System.out.println("total fare collected: " + t1.getFareCollected());
        // System.out.println("total passengers: " + t1.getPassengers());
        // if (!t1.isDiscountApplied() && t1.getTollFee() == 10.0 && t1.getFareCollected() == 12.5 && t1.getPassengers() == 3) {
        //   System.out.println("------------------------ TEST 1b PASS!");
        // } else {
        //   System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1b FAIL!!!!!!!!!!!!!!!!!! ---");
        // }
        // t1.pickupRiders(2, 5.90);
        // System.out.println("discount already applied? " + t1.isDiscountApplied());
        // System.out.println("toll fee: " + t1.getTollFee());
        // System.out.println("total fare collected: " + t1.getFareCollected());
        // System.out.println("total passengers: " + t1.getPassengers());
        // if (t1.isDiscountApplied() && t1.getTollFee() == 5.0 && t1.getFareCollected() == 24.3 && t1.getPassengers() == 5) {
        //   System.out.println("------------------------ TEST 1c PASS!");
        // } else {
        //   System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1c FAIL!!!!!!!!!!!!!!!!!! ---");
        // }
        // t1.pickupRiders(3, 3.40);
        // System.out.println("discount already applied? " + t1.isDiscountApplied());
        // System.out.println("toll fee: " + t1.getTollFee());
        // System.out.println("total fare collected: " + t1.getFareCollected());
        // System.out.println("total passengers: " + t1.getPassengers());
        // if (t1.isDiscountApplied() && t1.getTollFee() == 5.0 && t1.getFareCollected() == 34.5 && t1.getPassengers() == 8) {
        //   System.out.println("------------------------ TEST 1d PASS!");
        // } else {
        //   System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1d FAIL!!!!!!!!!!!!!!!!!! ---");
        // }
        // System.out.println("\n--------- TEST 2 ---------");
        // System.out.println("----- electric Taxi ------");
        // System.out.println("--------------------------");
        // Taxi t2 = new Taxi("KCD123", 25, 1, true, 6.0); // electric
        // t2.applyDiscount();
        // System.out.println("discount already applied? " + t2.isDiscountApplied());
        // System.out.println("toll fee: " + t2.getTollFee());
        // System.out.println("total fare collected: " + t2.getFareCollected());
        // System.out.println("total passengers: " + t2.getPassengers());
        // if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 6.0 && t2.getPassengers() == 1) {
        //   System.out.println("------------------------ TEST 2a PASS!");
        // } else {
        //   System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2a FAIL!!!!!!!!!!!!!!!!!! ---");
        // }
        // t2.pickupRiders(2, 3.7);
        // System.out.println("discount already applied? " + t2.isDiscountApplied());
        // System.out.println("toll fee: " + t2.getTollFee());
        // System.out.println("total fare collected: " + t2.getFareCollected());
        // System.out.println("total passengers: " + t2.getPassengers());
        // if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 13.4 && t2.getPassengers() == 3) {
        //   System.out.println("------------------------ TEST 2b PASS!");
        // } else {
        //   System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2b FAIL!!!!!!!!!!!!!!!!!! ---");
        // }
        // t2.pickupRiders(2, 4.75);
        // System.out.println("discount already applied? " + t2.isDiscountApplied());
        // System.out.println("toll fee: " + t2.getTollFee());
        // System.out.println("total fare collected: " + t2.getFareCollected());
        // System.out.println("total passengers: " + t2.getPassengers());
        // if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 22.9 && t2.getPassengers() == 5) {
        //   System.out.println("------------------------ TEST 2c PASS!");
        // } else {
        //   System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2c FAIL!!!!!!!!!!!!!!!!!! ---");
        // }
        
        // Car myCar = new Car("MK4567", 10.0, 3, true);
        // System.out.println(myCar.calculateTollPrice());
        
        // Car myCar2 = new Car("FJ8731", 10.0, 6, true);
        // System.out.println(myCar2.calculateTollPrice());
        
        // // the way toll price is calculated for a Vehicle
        // // shouldn't have changed
        // Vehicle myVehicle = new Vehicle("KX1543", 10.0, 6);
        // System.out.println(myVehicle.calculateTollPrice());

        // Truck myTruck = new Truck("TY45LX", 20.0, 3, 5, true);
        // System.out.println(myTruck.calculateTollPrice());
        
        // Truck myTruck2 = new Truck("LM90LX", 20.0, 3, 5, false);
        // System.out.println(myTruck2.calculateTollPrice());
        
        // // the way toll price is calculated for a Vehicle
        // // shouldn't have changed
        // Vehicle myVehicle2 = new Vehicle("TR987", 10.0, 6);
        // System.out.println(myVehicle2.calculateTollPrice());
        
        // Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
        // System.out.println(myTaxi3.getPassengers()); // should be 6, including driver
        
        // // now let's drop off the 5 riders, charging 3.50 per rider
        // boolean success = myTaxi3.chargeAndDropOffRiders(3.50);
        // System.out.println(success); // should be true
        // System.out.println(myTaxi3.getPassengers()); // should now be 1
        // System.out.println(myTaxi3.getFareCollected()); // should be 17.50
        
        // Car myFaveCar = new Car("MK4567", 10.0, 3, true);
        // Taxi myTaxiCab = new Taxi("TX1234", 10.0, 6, true, 0.0);
        // myFaveCar.printCar();
        // System.out.println();
        // myTaxiCab.printTaxi();
        
        // Vehicle myVehicle3 = new Vehicle("BB8123", 7.0, 3);
        // myVehicle3.printInfo();
        
        // Car myCar3 = new Car("MK4567", 6.75, 4, true);
        // myCar3.printInfo();
        // System.out.println();
        // Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
        // myTruck3.printInfo();

        // Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
        // myTaxi4.printInfo();

        Vehicle v1 = new Vehicle("USPS233", 2.75,2);
        v1.highwayParking();

        Car c1 = new Car("ANI5734", 2.75, 2, true);
        c1.highwayParking();

        Truck t1 = new Truck("H253JMX", 2.75, 1, 6, true);
        t1.highwayParking();

        Taxi tx1 = new Taxi("TX5453J", 2.75, 4, true, 0);
        tx1.highwayParking();
        
        
        
        
        


    }
}