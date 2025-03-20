public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printTaxi() {
        System.out.println("Licence PLate: " + this.getLicensePlate());
        System.out.println("Toll fee: " + this.getTollFee());
        System.out.println("Passengers: " + this.getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount applied? " + isDiscountApplied());
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



}
