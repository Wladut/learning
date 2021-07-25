package com.vrinceanuvladut;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vrinceanu Vladut on 07-09-2020
 * Time 1:19 AM
 */

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null){
        this.exits = new HashMap<String, Integer>(exits);}   // problema, daca null e pus in locul unui Map
        else {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q",0);
    }

//    public void addExit(String direction, int location){
//        exits.put(direction,location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

}
