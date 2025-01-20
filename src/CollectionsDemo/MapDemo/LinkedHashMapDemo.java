package CollectionsDemo.MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(123,"Rachana");
        lhm.put(223,null);
        lhm.put(143,null);
        lhm.put(323,"Sweta");
        lhm.put(153,"Arati");
        lhm.put('s',34);
        lhm.put(true,"Arati");
        lhm.put(false,"Arati");
        lhm.put(null,"Jueeli");

        System.out.println(lhm);
    }
}
