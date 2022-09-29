package com.comp301.a07pizza;

public class IngredientImpl implements Ingredient {
  private final String name;
  private final Boolean vegetarian;
  private final Boolean vegan;

  public IngredientImpl(String name, Boolean vegetarian, Boolean vegan) {
    if (name == null || vegetarian == null || vegan == null) {
      throw new IllegalArgumentException("Parameters invalid");
    }
    this.name = name;
    this.vegetarian = vegetarian;
    this.vegan = vegan;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public boolean isVegetarian() {
    return this.vegetarian;
  }

  @Override
  public boolean isVegan() {
    return this.vegan;
  }
}
