public class GamingDesktop extends Desktop{
    private String graphicsCard;

    public GamingDesktop(int screenSize, int memory, String graphicCard) {
        super(screenSize, memory, true);
        this.graphicsCard = graphicCard;

    }

    public void updateDriver() {
        System.out.println("Updating driver...");
        System.out.println("Screen may flashes");
        System.out.println("Update completed");
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

}