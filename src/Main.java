public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddtion1("Egg", 5.43);
        healthyBurger.addHamburgerAddition1("Lentils", 3.41);
        System.out.println("Total Burger price is " + healthyBurger.itemizeHamburger());
        System.out.println();


        DeluxeHamburger db = new DeluxeHamburger();
        System.out.println("Total Burger price is " + db.itemizeHamburger());
    }
}
