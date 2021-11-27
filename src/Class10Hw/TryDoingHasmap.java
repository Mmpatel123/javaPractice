package Class10Hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TryDoingHasmap {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("firstName", "megha");
        myMap.put("lastName", "patel");
        myMap.put("sub", "java");
        myMap.put("grade", "pass");
        System.out.println(myMap);
        System.out.println(myMap.size());
        System.out.println(myMap.get("firstName"));
        Set<String> keys = myMap.keySet();
        for (String key:keys){
            System.out.println(key);}
        int b = 99;
        int res = --b;
        System.out.println(res);
        int p=100;
        int ress=++p;
        System.out.println(ress);


    }
}
