package com.sd.task;

public interface Observe {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}