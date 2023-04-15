package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(false);
    dp.getPrice();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    System.out.println();
    Pizza p = new Pizza(true);
    p.getPrice();
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}