package headfirst.factory.pizzaaf.small;

public class PotatoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
