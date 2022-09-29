package com.comp301.a07pizza;

import com.comp301.a07pizza.Pizza.Size;

import java.util.ArrayList;

public class PizzaFactory {
  public static Pizza makeCheesePizza(Size size) {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    Crust crustCheese = Crust.HAND_TOSSED;
    Sauce sauceCheese = Sauce.TOMATO;
    Cheese cheeseCheese = Cheese.BLEND;
    return new PizzaImpl(size, crustCheese, sauceCheese, cheeseCheese, toppings);
  }

  public static Pizza makeHawaiianPizza(Size size) {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    toppings.add(Topping.HAM);
    toppings.add(Topping.PINEAPPLE);
    return new PizzaImpl(size, Crust.HAND_TOSSED, Sauce.TOMATO, Cheese.BLEND, toppings);
  }

  public static Pizza makeMeatLoversPizza(Size size) {
    // The factory method should create and return a new Pizza instance with deep-dish crust,
    // tomato sauce, cheese blend, and four toppings: pepperoni, sausage, bacon, and ground beef.
    // The returned Pizza object should also have the correct size as specified by the method's
    // parameter.
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    toppings.add(Topping.PEPPERONI);
    toppings.add(Topping.SAUSAGE);
    toppings.add(Topping.BACON);
    toppings.add(Topping.GROUND_BEEF);
    return new PizzaImpl(size, Crust.DEEP_DISH, Sauce.TOMATO, Cheese.BLEND, toppings);
  }

  public static Pizza makeVeggieSupremePizza(Size size) {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    toppings.add(Topping.SUN_DRIED_TOMATO);
    toppings.add(Topping.GREEN_PEPPER);
    toppings.add(Topping.MUSHROOMS);
    toppings.add(Topping.OLIVES);
    return new PizzaImpl(size, Crust.THIN, Sauce.TOMATO, Cheese.BLEND, toppings);
  }

  public static Pizza makeDailySpecialPizza() {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    toppings.add(Topping.BACON);
    toppings.add(Topping.GARLIC);
    toppings.add(Topping.SPINACH);
    return new PizzaImpl(
        Pizza.Size.LARGE, Crust.HAND_TOSSED, Sauce.TOMATO, Cheese.MOZZARELLA, toppings);
  }
}
