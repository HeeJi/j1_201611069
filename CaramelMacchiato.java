package headfirst.decorator.starbuzz;

public class CaramelMacchiato extends Beverage {
  public CaramelMacchiato() {
    description = "Caramel Macchiato Coffee";
  }
  public double cost() {
    return 1.19;
  }
}