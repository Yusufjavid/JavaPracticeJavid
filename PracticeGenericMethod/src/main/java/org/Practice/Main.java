package org.Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//Wrapper generic class for iteration without constructor,get,set,tostring
class data4{

    public <E> void listiteratormethd(List<E> list){
        for (E element: list){
            System.out.println(list);
            }
    }

    public <E> void arrayIterator(E[] arrayData){
        for (E element: arrayData){
            System.out.println(element);
        }

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //List Integer
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1.reversed());
        System.out.println("*************");
        // List string
        List<String> list2 = new ArrayList<>();
        list2.add("JAVA");
        list2.add("Learning");
        System.out.println(list2);
        System.out.println("*************");
        //String array
        String[] array2 = {"one","Two","Three","Four"};
        new data4().arrayIterator(array2);
        System.out.println("*************");

        //integer array
        Integer[] intarray3 = {1,2,3,4};
        new data4().arrayIterator(intarray3);
    }
}