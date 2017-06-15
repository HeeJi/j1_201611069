package headfirst.factory.pizzafm;

public class ChicagoStylePepperoniPizza extends Pizza {

  public ChicagoStylePepperoniPizza() { 
    name = "Chicago Style Pepproni Pizza";
    dough = "Thick Crust Style extra Thick Crust Dough";
    sauce = "Tomato Sauce with Plum Tomatoes";  
    toppings.add("Shreddid Mozzarella Cheese");
    toppings.add("Black Olives");
    toppings.add("Spinach");
    toppings.add("Eggplant");
    toppings.add("Sliced Pepperoni");
  }
}