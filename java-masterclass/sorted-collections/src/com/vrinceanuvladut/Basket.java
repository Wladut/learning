package com.vrinceanuvladut;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Vrinceanu Vladut on 28-10-12:26 AM
 * Time 12:26 AM
 */

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;  // item-ul de tipul StockItem cheie si Integer
    // folosit pentru cantitate;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity){
        if(item != null && quantity > 0){
            int intBasket = list.getOrDefault(item, 0);
            list.put(item, intBasket + quantity);
            return intBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" :" items") + "\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> item:list.entrySet()){
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
