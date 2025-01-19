package org.Practice;


import java.util.ArrayList;
import java.util.List;

class vehicle {
    private int id;

    public vehicle(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "id=" + id +
                '}';
    }
}

class Car extends vehicle{
      private String model;

    public Car(int id, String model) {
        super(id);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}



public class Main {
    public static void main(String[] args) {
        List<vehicle> list = new ArrayList<>();
        list.add(new vehicle(1));
        list.add(new vehicle(2));
        list.add(new vehicle(3));
        list.add(new vehicle(4));
        list.add(new vehicle(5));
        list.add(new Car(6,"Honda"));
        Main.display(list);

            }

            public static void display(List<? extends vehicle> list){
                for (vehicle data:list){
                    System.out.println(data);
                }

            }
}