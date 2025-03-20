public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    private double highwayParkingFee = 2.75;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void setPassengers(int passengers) {
      this.passengers = passengers;
    }

    public void setTollFee(double tollFee) {
      this.tollFee = tollFee;
    }

    public void printInfo() {
      System.out.println("Licence PLate: " + this.getLicensePlate());
      System.out.println("Toll fee: " + this.getTollFee());
      System.out.println("Passengers: " + this.getPassengers());
    }

    public double highwayParking() {
      double fee = getPassengers() * highwayParkingFee;
      System.out.println("The parking fee based on passengers for " + getLicensePlate() + " is $" + fee);
      return fee;

    }
  }