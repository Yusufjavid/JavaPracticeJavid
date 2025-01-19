package org.Practice;


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

class GenericData<T>{
    private T genericData;

    public GenericData(T genericData) {
        this.genericData = genericData;
    }

    public T getGenericData() {
        return genericData;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Data data = new Data("Some data");  //object creation using data class
//                String x  = (String) data.getObject(); //assigning name and get the object from getter
//         System.out.println(x);

        GenericData<String> genericData = new GenericData<>("JAVA Learn");
        String  y = genericData.getGenericData();
        System.out.println(y);

        }
    }
