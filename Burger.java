package HW_15;

import java.util.*;

public class Burger {
    private int finalPrice = 50;
    ArrayList<String> addedToppings = new ArrayList<String>();


    public Burger() {
    }

    public void askForToppings() {

        HashMap<String, Integer> burgerToppings = new HashMap<String, Integer>();
        burgerToppings.put("Соус", 10);
        burgerToppings.put("Сыр", 20);
        burgerToppings.put("Котлета", 30);

        System.out.println("Список дополнительных ингридиентов к вашему бургеру: ");

        for (Map.Entry<String, Integer> entry : burgerToppings.entrySet()) {
            System.out.println("Ингридиент : " + entry.getKey() + ", Цена : " + entry.getValue());
        }
    }

    public void addToppings() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Хотите ли вы добавить ингридиент? Введите да/нет: ");

        while (!myScanner.nextLine().equals("нет")) {
            System.out.println("Введите названия дополнительного ингридиента: ");
            addedToppings.add(myScanner.nextLine());
            System.out.println("Хотите ли вы добавить ингридиент? Введите да/нет: ");
        }
    }

    public int getPrice() {
        if (addedToppings.contains("соус")) {
            int saucePrice = 10;
            finalPrice += saucePrice;
        }
        if (addedToppings.contains("сыр")) {
            int cheesePrice = 20;
            finalPrice += cheesePrice;
        }
        if (addedToppings.contains("котлета")) {
            int meatPrice = 30;
            finalPrice += meatPrice;
        }

        return finalPrice;
    }
}

