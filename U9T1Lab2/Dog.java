package U9T1Lab2;


public class Dog extends Animal{
    private boolean walked;
    private boolean sleep = true;




    public Dog(String name, int age, boolean vaccinated, boolean walked) {
        super(name, age, vaccinated);
        this.walked = walked;
    }


    public void walk() {
        walked = true;
    }


    public boolean hasBeenWalked() {
        return walked;
    }
   
    public void sleepStatus() {
        if(this.getFeedTIme() > 0) {
            System.out.println(this.getName() + " is currently awake");
        }
        else if(!sleep) {
            System.out.println(this.getName() + " is currently awake");
        }
        else {
            System.out.println(this.getName() + " is currently sleeping");
        }
    }
}




