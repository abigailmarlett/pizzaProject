package com.comp301.a07pizza;

import java.util.ArrayList;

public class PizzaImpl implements Pizza {
  private final Size size;
  private final Crust crust;
  private final Sauce sauce;
  private final Cheese cheese;
  private final ArrayList<Topping> toppings;
  private boolean vegetarian;
  private boolean vegan;
  private double price;

  public PizzaImpl(
      Size size, Crust crust, Sauce sauce, Cheese cheese, ArrayList<Topping> toppings) {
    this.size = size;
    this.crust = crust;
    this.sauce = sauce;
    this.cheese = cheese;
    this.toppings = toppings;
  }

  @Override
  public boolean isVegetarian() {
    for (Ingredient i : getIngredients()) {
      if (!i.isVegetarian()) {
        return false;
      }
    }
    /*if (crust.isVegetarian() & sauce.isVegetarian() & cheese.isVegetarian()) {
    vegetarian = true;
    for (Topping topping : toppings) {
      if (!topping.isVegetarian()) {
        return false;
      }
    }*/
    // }
    return true;
  }

  @Override
  public boolean isVegan() {
    for (Ingredient i : getIngredients()) {
      if (!i.isVegan()) {
        return false;
      }
    }
    /*if (crust.isVegan() & sauce.isVegan() & cheese.isVegan()) {
      vegan = true;
      for (Topping topping : toppings) {
        if (!topping.isVegan()) {
          return false;
        }
      }
    }*/
    return true;
  }

  @Override
  public double getPrice() {
    // If the pizza is small, its price should be $7.00 plus $0.25 per topping.
    // If it is medium, its price should be $9.00 plus $0.50 per topping.
    // If it is large, its price should be $11.00 plus $0.75 per topping.
    if (size == Size.SMALL) {
      double toppingCost = 0.25 * toppings.size();
      price = 7.0 + toppingCost;
    }
    if (size == Size.MEDIUM) {
      double toppingCost = 0.5 * toppings.size();
      price = 9.0 + toppingCost;
    }
    if (size == Size.LARGE) {
      double toppingCost = 0.75 * toppings.size();
      price = 11.0 + toppingCost;
    }
    return price;
  }

  @Override
  public Size getSize() {
    return size;
  }

  @Override
  public Ingredient getSauce() {
    return sauce;
  }

  @Override
  public Ingredient getCheese() {
    return cheese;
  }

  @Override
  public Ingredient getCrust() {
    return crust;
  }

  @Override
  public Ingredient[] getToppings() {
    Ingredient[] ingredientList = new Ingredient[toppings.size()];
    for (int i = 0; i < toppings.size(); i++) {
      ingredientList[i] = toppings.get(i);
    }
    return ingredientList;
  }

  @Override
  public Ingredient[] getIngredients() {
    Ingredient[] ingredientList = new Ingredient[toppings.size() + 3];
    ingredientList[0] = crust;
    ingredientList[1] = sauce;
    ingredientList[2] = cheese;
    for (int i = 3; i < toppings.size() + 3; i++) {
      ingredientList[i] = toppings.get(i - 3);
    }
    return ingredientList;
  }
}
