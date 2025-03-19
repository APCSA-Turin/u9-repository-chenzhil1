package U9T1Lab2;


public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private int feedTime = 0;


    public Animal(String name, int age, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
    }


    public void adopt() {
        vaccinated = true;
        System.out.println("You have adopted " + name + " and vaccinated it");
    }


    public void feed() {
        System.out.println("You fed " + name);
        feedTime ++;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public boolean getVaccineStatus() {
        return vaccinated;
    }


    public int getFeedTIme() {
        return feedTime;
    }


    public void fedToday() {
        System.out.println("You fed " + name + " " + feedTime + " times today");
    }


}
