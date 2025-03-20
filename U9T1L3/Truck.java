public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Number of axles: " + getAxles());
        System.out.println("Has trailer?" + hasTrailer());
    }

    public boolean validateLicensePlate() {
      if(hasTrailer && axles > 4) {
        if(!(getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX"))) {
          return false;
        }
      }
      else if(hasTrailer) {
        if(!getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")) {
          return false;
        }
      }
      return true;
    }

    @Override 
    public double calculateTollPrice() {
      if(hasTrailer()) {
        return getAxles() * getTollFee() * 2;
      }
      return getAxles() * getTollFee();
    }

  }