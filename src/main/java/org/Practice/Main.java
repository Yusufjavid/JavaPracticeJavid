package org.Practice;

import java.util.LinkedList;
import java.util.*;

 class Data {
      private Object object;

    public Data(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    public Object getObject() {
        return object;
    }
}

class Name {

    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Chaand"));
        elements.add(new Data('£'));
        elements.add(new Data(25));
        elements.add(new Data(52.65));
        elements.add(new Data(new Name("StudyEasy")));
        System.out.println(elements);

        Data x = new Data("Awesome");
        System.out.println(x.getObject());
    }

 }









