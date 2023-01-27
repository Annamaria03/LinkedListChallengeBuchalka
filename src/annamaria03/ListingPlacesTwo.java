package annamaria03;

import java.util.*;

public class ListingPlacesTwo {

    private HashMap<String, Integer> places;
    private LinkedHashMap<String, Integer> sortedPlaces;


    public ListingPlacesTwo() {
        this.places = new HashMap<>();
        this.sortedPlaces = new LinkedHashMap<>();

    }

    public void menuDisplayer() {
        String menuText = """
                                
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit 
                """;
        System.out.println(menuText);
    }

    public HashMap<String, Integer> getPlaces() {
        places.put("Adelaide", 1374);
        places.put("Alice Springs", 2771);
        places.put("Brisbane", 917);
        places.put("Darwin", 3972);
        places.put("Melbourne", 877);
        places.put("Perth", 3923);
        places.put("Sydney", 0);
        return this.places;
    }

    public LinkedHashMap<String, Integer> sortedPlacesFromSydney() {
        getPlaces().entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedPlaces.put(x.getKey(), x.getValue()));

        return sortedPlaces;
    }

    public String extractStartingCity() {
        LinkedList<String> listKeys = new LinkedList<String>(this.sortedPlaces.keySet());
        return listKeys.getFirst();
    }

    public void iteratePlacesSydneyToDarwin() {
        Iterator<Map.Entry<String, Integer>> iterator = this.sortedPlaces
                .entrySet()
                .iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("-------->" + "Distance from "
                    + entry.getKey() + " to "
                    + extractStartingCity()
                    + " is " + entry.getValue() + " km.");
        }

    }

    public void iteratePlacesFromDarwinToSydney() {
        List<String> keys = new ArrayList<>(this.sortedPlaces.keySet());
        Collections.reverse(keys);
        for (String element : keys) {
            System.out.println("-------->" + "Distance from "
                    + element + " to "
                    + extractStartingCity()
                    + " is " + sortedPlaces.get(element) + " km.");
        }

    }


}