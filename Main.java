package com.sd.task;
import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Data person = new Data();
    DisplayData currentDisplay = new DisplayData(person);
    person.setData("친구", 01012123434);
    person.setData("동기", 01045452323);
    person.setData("사람", 01021213232);
    person.setData("선배", 01055446644);
    System.out.println("1-추가 \n 2-삭제");
    Scanner a = new Scanner(System.in);
    int number = a.nextInt();
    if (number==1) {
      System.out.println("이름을 입력하세요.");
      Scanner b = new Scanner(System.in);
      String s = b.next();
      System.out.println("번호를 입력하세요");
      Scanner c = new Scanner(System.in);
      int pn = c.nextInt();
      System.out.println("추가 : ");
      person.setData(s, pn);
    }
    else if (number==2) {
      System.out.println("삭제할 번호를 선택하세요. :");
      person.removeObserver(currentDisplay);
      System.out.println("삭제되었습니다.");
    }
  }
}