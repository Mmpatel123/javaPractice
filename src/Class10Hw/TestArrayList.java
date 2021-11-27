package Class10Hw;

import java.util.ArrayList;

import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {

           ArrayList<String> studentName = new ArrayList<>();
           studentName.add("Dev");
        studentName.add("Aarya");
        studentName.add("Megha");
        Collections.sort(studentName);
        System.out.println(studentName); //will print all the members
        for (String name:studentName){
            System.out.println(name);  // will print individual
        }
        studentName.remove("Dev");
        System.out.println("dev is naughty  boy "
        +studentName.add("Megha"));//you can remove someones name
    }
}
