public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Fare collected: " + fareCollected);

    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(numRiders + getPassengers());
        fareCollected = fareCollected + numRiders * farePerRider;
        if(!isDiscountApplied() && getPassengers() >= 4) {
            setTollFee(getTollFee() / 2.0);
            discounted();
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        if(getPassengers() > 1) {
            fareCollected += farePerRider * (getPassengers() - 1);
            dropOffPassengers(getPassengers() - 1);
            return true;
        }
        return false;
    }
    @Override
    public double highwayParking() {
      double fee = super.highwayParking();
      fee += 5.99;
      System.out.println("Taxi charges extra $5.99 of parking fee");
      System.out.println("The total will be $" + fee);
      return fee;
    }


}
