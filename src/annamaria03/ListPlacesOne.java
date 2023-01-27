package annamaria03;

import java.util.Collections;
import java.util.LinkedList;


public class ListPlacesOne {
    private LinkedList<String> cities;
    private LinkedList<Integer> distances;

    private LinkedList<Integer> naturalOrderDistances;

    public ListPlacesOne() {
        this.cities = new LinkedList<>();
        this.distances = new LinkedList<>();
        this.naturalOrderDistances = new LinkedList<>();

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

    public LinkedList<Integer> getDistances() {
        distances.add(0);
        distances.add(1374);
        distances.add(2771);
        distances.add(917);
        distances.add(3972);
        distances.add(877);
        distances.add(3923);
        return this.distances;
    }

    public LinkedList<String> getCities() {
        cities.add("Sydney");
        cities.add("Adelaide");
        cities.add("Alice Springs");
        cities.add("Brisbane");
        cities.add("Darwin");
        cities.add("Melbourne");
        cities.add("Perth");
        return this.cities;
    }

    public String extractStartingPoint() {
        for (String element : getCities()) {
            if (element.equals("Sydney")) {
                return element;
            }
        }
        return null;
    }

    public LinkedList<Integer> setNaturalOrderDistances() {
        Collections.sort(getDistances());
        return distances;
    }

    public void iterate() {

        for (Integer start : setNaturalOrderDistances()) {
            if (start.equals(0)) {
                System.out.printf("Your are in %s at your starting city %n", extractStartingPoint()); //+ " at your starting city."
            } else if (start.equals(877)) {
                System.out.printf("From Melbourne to %s the distance is: %d km. %n", extractStartingPoint(), start); // + " the distance is: " + start + " km."
            } else if (start.equals(917)) {
                System.out.printf("From Brisbane to %s the distance is: %d km. %n", extractStartingPoint(), start);
            } else if (start.equals(1374)) {
                System.out.printf("From Adeleid to %s the distance is: %d km. %n", extractStartingPoint(), start);
            } else if (start.equals(2771)) {
                System.out.printf("From Alice Spring to %s the distance is: %d km. %n", extractStartingPoint(), start);
            } else if (start.equals(3923)) {
                System.out.printf("From Perth to %s the distance is: %d km. %n", extractStartingPoint(), start);
            } else if (start.equals(3972)) {
                System.out.printf("From Darwin to %s the distance is: %d km. %n", extractStartingPoint(), start);
            } else if (start.equals(0)) {
                System.out.printf("Your are in %s at your at final destination %n", extractStartingPoint()); //+ " at your starting city."
            }

        }
    }

    public void iterateBackward() {
        //Iterator<Integer> iterator=setNaturalOrderDistances().descendingIterator();
        var iterator = setNaturalOrderDistances().listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(0)) {
                System.out.printf("Your are in %s at your starting city %n", extractStartingPoint());
                System.out.printf("This is the point where I seemingly failed the task, but NOPe because it's all about (self)development" +
                        " %n and it is part of the process.. I did not copy any solution while learnt a lot. " +
                        "%n Obviously the ideal situation could have been seeing run LinkedList solution as the rest of my implemented ideas " +
                        "%n No excuses, don't really like to cover myself with cheap talk. It is as it is.");
          /*  } else if (iterator.next().equals(877)) {
                System.out.printf("From Melbourne to %s the distance is: %d km. %n", extractStartingPoint(), 22);
            } else if (iterator.next().equals(917)) {
                System.out.printf("From Brisbane to %s the distance is: %d km. %n", extractStartingPoint(), 22);
            } else if (iterator.next().equals(1374)) {
                System.out.printf("From Adeleid to %s the distance is: %d km. %n", extractStartingPoint(), 22);
            } else if (iterator.next().equals(2771)) {
                System.out.printf("From Alice Spring to %s the distance is: %d km. %n", extractStartingPoint(),22);
            } else if (iterator.next().equals(3923)) {
                System.out.printf("From Perth to %s the distance is: %d km. %n", extractStartingPoint(),22);
            } else if (iterator.next().equals(3972)) {
                System.out.printf("From Darwin to %s the distance is: %d km. %n", extractStartingPoint(), 22);
            } else if (iterator.next().equals(0)) {
                System.out.printf("Your are in %s at your at final destination %n", extractStartingPoint()); //+ " at your starting city."
            }
        }while(iterator.hasPrevious()){
            System.out.println("Flash what i want.. "+ iterator.hasPrevious());
        }*/
            }
        }
    }

}