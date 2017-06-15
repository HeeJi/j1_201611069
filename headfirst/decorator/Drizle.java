package headfirst.decorator.starbuzz;

public class Drizle extends CondimentDecorator {
  Beverage beverage;
  public Drizle(Beverage beverage) {
    this.beverage = beverage;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Drizle";
  }
  public double cost() {
    return .50 + beverage.cost();
  }
}