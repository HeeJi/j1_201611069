package com.sd.task;

public class DisplayData implements Observer, Display {
  private String name;
  private int phonenumber;
  private Observe person;
  
  public DisplayData(Observe person) {
    this.person = person;
    person.registerObserver(this);
  }
  
  public void update(String name, int phone) {
    this.name = name;
    this.phonenumber = phonenumber;
    display();
  }
  
  public void display() {
    System.out.println(name + phonenumber);
  }
}