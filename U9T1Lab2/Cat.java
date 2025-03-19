package U9T1Lab2;


public class Cat extends Animal{
    private boolean played;
    private String furColors;
    private String[] fur = {"Tabby", "Calico", "Solid", "Tortoiseshell", "Cinnamon", "Black"};


    public Cat(String name, int age, boolean vaccinated, boolean played) {
        super(name, age, vaccinated);
        this.played = played;
        furColors = fur[(int)(Math.random() * fur.length)];


    }


    public void play() {
        played = true;
    }


    public boolean hasPlayedWith() {
        return played;
    }


    public void furColor() {
        System.out.println(this.getName() + " has a fur colot of " + furColors);
    }
}
