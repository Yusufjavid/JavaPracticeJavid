package org.Practice;

/*
        T -Type
        E - Elements
        K- Key
        N - number
        V - Value
 */

class Data3<K,V> {

    private K key;
    private V Value;

    public Data3(K key, V value) {
        this.key = key;
        Value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return Value;
    }

    public void setValue(V value) {
        Value = value;
    }

    @Override
    public String toString() {
        return "Data3{" +
                "key=" + key +
                ", Value=" + Value +
                '}';
    }

    public <N,E> void display(N number,E element){
        System.out.println("NUmber: " +number + "ELEMENT: " +element);

    }

}

//Generic method for element, key , number  ,value

public class Main {
    public static void main(String[] args) {
        Data3<Integer,String> data3 = new Data3<>(10, "JAVID");
        System.out.println(data3.getKey() +"," +data3.getValue());
        data3.display("007","YUSUF JAVID");


    }
}