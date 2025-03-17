public class Fruit extends Food {
    private boolean ripe;
    private boolean dried;
    private String seed;
    
    public Fruit(String name, double costPerPound, double weight, boolean ripe, boolean dried, String seed) {
        super(name, costPerPound, weight);
        this.ripe = ripe;
        this.dried = dried;
        this.seed = seed;
    }

    public void isRipe() {
        if(ripe) {
            System.out.println("This fruit is ripe");
        }
        else {
            System.out.println("This fruit is NOT ripe");
        }
    }

    public void isDried() {
        if(dried) {
            System.out.println("This is a dried fruit");
        }
        else {
            System.out.println("This is a fresh fruit");
        }
    }

    public void seedSize() {
        System.out.println("The seed is "  + seed);
    }
}
