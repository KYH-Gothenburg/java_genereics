import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static <T, U>  void print(T a, U b) {
        System.out.println(a);
        System.out.println(b);
    }


    public static void printList(List<?> list) {
        for(var value : list) {
            System.out.println(value);
        }
    }


    public static void someMethod(IMyInterface a) {
        System.out.println(a.add(2, 3));
        System.out.println(a.subtract(2, 3));
    }

    public static void someOtherMethod(MyClass2 m2) {
        m2.hej();
    }

    public static void main(String[] args) {
        MyClass1 m1 = new MyClass1();
        MyClass2 m2 = new MyClass2();
        someMethod(m1);
        someMethod(m2);
        someOtherMethod(m2);


        print("Hej", 34);
        Person p1 = new Person("Alice", 34);
        print(p1, "Hepp");
        print("Hepp", p1);
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("One");
        arr1.add("Two");
        LinkedList<Integer> arr2 = new LinkedList<>();
        arr2.add(1);
        arr2.add(2);
        Vector<Person> arr3 = new Vector<>();
        arr3.add(new Person("Alice", 34));
        arr3.add(new Person("Bob", 45));
        printList(arr1);
        printList(arr2);
        printList(arr3);

//        Pair<String, Integer> one = new Pair<>("One", 1);
//        Pair<String, String> two = new Pair<>("Two", "Två");
//
//        System.out.println(one.getKey() + ": " + one.getValue());
//        System.out.println(two.getKey() + ": " + two.getValue());
//
//        Person p1 = new Person("Anna", 23);
//        System.out.println(p1);
//
//        Person p2 = new Person("Bob", 44);
//        Pair<String, Person> three = new Pair<>("First", p1);
//        Pair<Person, Integer> four = new Pair<>(p2, 23);
//
        Pair<Integer, String> p = new Pair<>(23, "Hej");
        Value<Pair<Integer, String>> value = new Value<>(p);

//
        Pair<String, Value<Pair<Integer, String>>> five = new Pair<>("Five", value);
        System.out.println(five);



//        Value<String> value1 = new Value<>();
//        value1.setValue("Hej");
//        System.out.println(value1.getValue());
//
//        Value<Integer> value2 = new Value<>();
//        value2.setValue(120);
//        System.out.println(value2.getValue());
//
//        Value<Double> value3 = new Value<>();
//        value3.setValue(56.45);
//        System.out.println(value3.getValue());

//        System.out.println(add(2, 3));
//        System.out.println(add(2.4, 3.3));
//        System.out.println(add("Hej", "då"));
    }
}
