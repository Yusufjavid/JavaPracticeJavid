package org.Practice;


import java.awt.*;
import java.util.LinkedList;
import java.util.List;

class Data1<T>{
    private T object;

    public Data1(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        List<Data1<Object>> elements = new LinkedList<>();
        elements.add(new Data1<>("JAVID"));
        elements.add(new Data1<>("YUSUF"));
        elements.add(new Data1<>("90.0"));
        elements.add(new Data1<>("1600"));

      for (Object Data1:elements){
          System.out.println(Data1);

        }
    }
}