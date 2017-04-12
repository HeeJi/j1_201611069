package headfirst.decorator.starbuzz;

public class Banila extends CondimentDecorator {
  Beverage beverage;
  public Banila(Beverage beverage) {
    this.beverage = beverage;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Banila Sirup";
  }
  public double cost() {
    return .60 + beverage.cost();
  }
}