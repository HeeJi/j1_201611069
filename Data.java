package com.sd.task;
import java.util.*;

public class Data implements Observe {
  private ArrayList observers;
  private String name;
  private int phonenumber;
  
  public Data() {
    observers = new ArrayList();
  }
  
  public void registerObserver(Observer o) {
    observers.add(o);
  }
  
  public void removeObserver(Observer o) {
    Scanner h = new Scanner(System.in);
    int n = h.nextInt();
    n = observers.indexOf(o);
    if (n >= 0) {
      observers.remove(n);
    }
  }
  
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer)observers.get(i);
      observer.update(name, phonenumber);
    }
  }
  
  public void dataChanged() {
    notifyObservers();
  }
  
  public void setData(String name, int phonenumber) {
    this.name = name;
    this.phonenumber = phonenumber;
    dataChanged();
  }
  
  public String getName() {
    return name;
  }
  
  public int getPhonenumber() {
    return phonenumber;
  }
}