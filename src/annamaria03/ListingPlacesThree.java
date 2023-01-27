package annamaria03;

import java.util.Collections;
import java.util.TreeMap;

public class ListingPlacesThree {
    private TreeMap<Integer, String> places;
    private TreeMap<Integer, String> sortedMap;

    public ListingPlacesThree() {
        this.places = new TreeMap<>();
        this.sortedMap = new TreeMap<>(Collections.reverseOrder());
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

    public TreeMap<Integer, String> getPlaces() {
        places.put(0, "Sydney");
        places.put(1374, "Adelaide");
        places.put(2771, "Alice Springs");
        places.put(917, "Brisbane");
        places.put(3972, "Darwin");
        places.put(877, "Melbourne");
        places.put(3923, "Perth");
        return this.places;
    }

    public String extractStartingCity() {
        String startingPoint = this.sortedMap.tailMap(0).toString().substring(3, 9);
        return startingPoint;
    }

    public void sortedPlacesFromSydney() {
        this.sortedMap.putAll(getPlaces());
        System.out.println(sortedMap.descendingMap());
    }

    public void iterateTowardsSydney() {
        String startingTown = extractStartingCity();
        this.sortedMap.pollLastEntry();
        sortedMap.entrySet()
                .forEach(entry -> {
                    System.out.println("From " + entry.getValue() + " to "
                            + startingTown + " takes " + entry.getKey() + " km."
                    );
                });
        System.out.println("And you are in: " + startingTown);
    }

    public void iterateBackwards() {
        System.out.println("You are in Sydney ");
        sortedMap.descendingMap().entrySet()
                .forEach(entry -> {
                    System.out.println("From " + entry.getValue() + " to"
                            + " Sydney" + " takes " + entry.getKey() + " km."
                    );
                });

    }

}
