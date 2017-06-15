package headfirst.factory.pizzafm;

public class ChicagoStyleClamPizza extends Pizza {

  public ChicagoStyleClamPizza() { 
    name = "Chicago Style Clam Pizza";
    dough = "Thick Crust Style extra Thick Crust Dough";
    sauce = "Tomato Sauce with Plum Tomatoes";  
    toppings.add("Shredded Mozzarella Cheese");
    toppings.add("Frozen Clams from Chesapeak Bay");
  }
}