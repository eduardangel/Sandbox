package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
  public static void main(String[] args) {
    //Можно объявить массив таким образом
//    String[] langs = new String[4];
//    langs[0] = "Java";
//    langs[1] = "C#";
//    langs[2] = "Python";
//    langs[3] = "PHP";
    //Можно таким
    String[] langs = {"Java", "C#" ,"Python", "PHP"};
    //Можно вывести элементы массива на консоль, через цикл "for"
//    for (int i = 0; i < langs.length; i++) {
//      System.out.println("Я хочу выучить " + langs[i]);
//    }
    //Есть специальная запись для вывода массива на консоль
//    for (String l : langs){
//      System.out.println("Я хочу выучить " + l);
//    }
    //Можно так инициализировать коллекцию
//    List<String> languages = new ArrayList<String>();
//    languages.add("Java");
//    languages.add("C#");
//    languages.add("Python");
    //А можно так инициализировать коллекцию, как аналог с массивом
    List<String> languages = Arrays.asList("Java", "C#" ,"Python", "PHP");
    for (String l : languages) {
      System.out.println("Я хочу выучить " + l);
    }
    for (int i = 0; i < languages.size(); i++){
      System.out.println("Я хочу выучить " + languages.get(i));
    }
  }
}
