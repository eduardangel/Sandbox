package org.example;

public class Equality {
  public static void main(String[] args) {
    /*String s1 = "Firefox";
    String s2 = s1;*/

    /*String s1 = "Firefox";
    String s2 = new String(s1);*/

    /*String s1 = "Firefox";
    String s2 = "Firefox";*/

    /*String s1 = "Firefox";
    String s2 = "Fir" + "efox";*/

    String s1 = "Firefox 2.0";
    String s2 = "Firefox " + Math.sqrt(4.0);

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}
