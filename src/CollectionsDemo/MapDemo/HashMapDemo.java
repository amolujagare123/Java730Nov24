package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(123,"Rachana");
        hm.put(223,null);
        hm.put(143,null);
        hm.put(323,"Sweta");
        hm.put(153,"Arati");
        hm.put('s',34);
        hm.put(true,"Arati");
        hm.put(false,"Arati");
        hm.put(null,"Jueeli");


        System.out.println(hm);

        hm.put(153,"anita");
        hm.put(null,"Arati");
        System.out.println(hm);


    }
}
