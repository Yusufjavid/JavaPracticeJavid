package org.Practice;


class data5 <K,V>{
    private K key;
    private V value;

    public data5(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "data5{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public <E,N> void genericData(E elements, N number){
        System.out.println( " "+elements + " " +number);
    }

}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        data5<Integer, String> elementNumber = new data5<>(1, "Yusuf");
        elementNumber.genericData('$', 5000);
    }
}