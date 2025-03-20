public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void printCar() {
        System.out.println("Licence PLate: " + this.getLicensePlate());
        System.out.println("Toll fee: " + this.getTollFee());
        System.out.println("Passengers: " + this.getPassengers());
        System.out.println("Electric? " + electric);
        System.out.println("Discount applied? " + isDiscountApplied());
    }

    public boolean dropOffPassengers(int numOut) {
        if(getPassengers() >= numOut) {
            setPassengers(getPassengers() - numOut);
            return true;
        }
        else {
            return false;
        }
    }

    public void applyDiscount() {
        if(!isDiscountApplied() && isElectric()) {
            setTollFee(getTollFee() / 2.0);
            discountApplied = true;
        }

    }
    public void discounted() {
      discountApplied = true;
    
    }
  }