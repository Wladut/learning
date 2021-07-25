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

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q",0);   // to not have repeated code in the main function
    }

    public void addExit(String direction, int location){
        exits.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        // create new HashMap constructor
        // nothing can change exists, getter return a copy of exists
        return new HashMap<String, Integer>(exits);
    }

}
