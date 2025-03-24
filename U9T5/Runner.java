package U9T5;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Animal thing = new Animal("Thing");
        Puppy spot = new Puppy("Spot");
        Cow marge = new Cow("Marge");
        Dog penny = new Dog("Penny");
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(thing);
        animalList.add(spot);
        animalList.add(marge);
        animalList.add(penny);
        for(Animal animal : animalList) {
            System.out.println(animal.getName());
        }
        for(int i = 0; i < animalList.size(); i ++) {
            if(animalList.get(i) instanceof Cow) {
                ((Cow) animalList.get(i)).milk();
            }
        }
    }


}
