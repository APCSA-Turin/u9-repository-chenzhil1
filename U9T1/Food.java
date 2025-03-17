public class Food {
    private String name;
    private double costPerPound;
    private double weight;

    public Food(String name, double costPerPound, double weight) {
        this.name = name;
        this.costPerPound = costPerPound; 
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return costPerPound;
    }

    public double getWeight() {
        return weight;
    }
     
}