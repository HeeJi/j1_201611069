package com.sd.sort.vi;
//import java.util.Araays;

public class Weight implements Comparable {
  private int kilo;
  public Weight (int k) {
    kilo=k;
  }
  public int compareTo (Object o) {
    Weight w=(Weight)o;
    return this.kilo-w.kilo;
  }
  public String toString() {
    String msg=kilo+"";
    return msg;
  }
}