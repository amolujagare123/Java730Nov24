package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer,String> lhm = new TreeMap<>();
        lhm.put(123,"Rachana");
        lhm.put(223,null);
        lhm.put(143,null);
        lhm.put(323,"Sweta");
        lhm.put(153,"Arati");

        System.out.println(lhm);
    }
}
