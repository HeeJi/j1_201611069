package headfirst.factory.pizzafm;

public class NYStylePepperoniPizza extends Pizza {

  public NYStylePepperoniPizza() { 
    name = "NY Style Pepperoni Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";  
    toppings.add("Pepperoni");
    toppings.add("Slicd Pepperoni");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Mushrooms");
    toppings.add("Red pepper");
  }
}