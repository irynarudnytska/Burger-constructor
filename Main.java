package HW_15;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        burger.askForToppings();
        burger.addToppings();
        System.out.println("Цена Вашего бургера: " + burger.getPrice());
    }
}
