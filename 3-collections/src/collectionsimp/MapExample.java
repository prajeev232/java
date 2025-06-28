package collectionsimp;

/*
Maps keys to values. Not technically a subtype of Collection but is part of the Collections framework. Duplicate keys not allowed.
Implementations:
Hashmap -> Hash table based implementation. Offers avg const-time performance for get/put. Iteration order is unpredictable.
LinkedHashMap -> Extends HashMap but maintains insertion order of entries.
TreeMap -> Implements SortedMap, storing keys in sorted order.
*/

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> countryCodes = new HashMap<String, String>();

        countryCodes.put("USA", "US");
        countryCodes.put("FR", "France");
        countryCodes.put("AU", "Australia");

        String country = countryCodes.get("USA");
        System.out.println("Country for code USA " + country);

        for (Map.Entry<String, String> entry : countryCodes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        if (countryCodes.containsKey("FR")) {
            System.out.println(countryCodes.get("FR"));
        }

        countryCodes.remove("FR");
        System.out.println(countryCodes);
    }
}
