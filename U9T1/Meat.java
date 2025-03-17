public class Meat extends Food{
    private boolean raw;
    private String season;
    private boolean boneless;

    public Meat(String name, double costPerPound, double weight, boolean raw, String season, boolean boneless) {
        super(name, costPerPound, weight);
        this.raw = raw;
        this.season = season;
        this.boneless = boneless;
    }

    public void isRaw() {
        if(raw) {
            System.out.println("This meat is RAW");
        }
        else {
            System.out.println("This meat is not raw");
        }
    }

    public void seasonType() {
        System.out.println("This meat is" + season);
    }

    public void isBoneless() {
        if(boneless) {
            System.out.println("This meat is boneless");
        }
        else {
            System.out.println("This meat is NOT boneless");
        }
    }
}
