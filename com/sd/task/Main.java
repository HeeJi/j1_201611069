package com.sd.task;
import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Data person = new Data();
    DisplayData currentDisplay = new DisplayData(person);
    person.setData("ģ��", 01012123434);
    person.setData("����", 01045452323);
    person.setData("���", 01021213232);
    person.setData("����", 01055446644);
    System.out.println("1-�߰� \n 2-����");
    Scanner a = new Scanner(System.in);
    int number = a.nextInt();
    if (number==1) {
      System.out.println("�̸��� �Է��ϼ���.");
      Scanner b = new Scanner(System.in);
      String s = b.next();
      System.out.println("��ȣ�� �Է��ϼ���");
      Scanner c = new Scanner(System.in);
      int pn = c.nextInt();
      System.out.println("�߰� : ");
      person.setData(s, pn);
    }
    else if (number==2) {
      System.out.println("������ ��ȣ�� �����ϼ���. :");
      person.removeObserver(currentDisplay);
      System.out.println("�����Ǿ����ϴ�.");
    }
  }
}