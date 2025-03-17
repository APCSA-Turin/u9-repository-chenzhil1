public class FoodRunner {
    public static void main(String[] args) {
        Food cookie = new Food("cookie", 16, 2);
        System.out.println("The price of the " + cookie.getName() + " is ");
        System.out.println("$" + cookie.getPrice() + " per pound, and ");
        System.out.println("it is " + cookie.getWeight() + " pounds");
        System.out.println();

        Fruit apples = new Fruit("apple", 2.99, 3, true, false, "small");
        System.out.println("The price of the " + apples.getName() + " is ");
        System.out.println("$" + apples.getPrice() + " per pound, and ");
        System.out.println("it is " + apples.getWeight() + " pounds");
        apples.isRipe();
        apples.isDried();
        apples.seedSize();
        System.out.println();

        Meat steak = new Meat("steak", 13.99, 5, false, "salted", false);
        System.out.println("The price of the " + steak.getName() + " is ");
        System.out.println("$" + steak.getPrice() + " per pound, and ");
        System.out.println("it is " + steak.getWeight() + " pounds");
        steak.isRaw();
        steak.seasonType();
        steak.isBoneless();
        System.out.println();
    }
}
