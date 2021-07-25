package com.vrinceanuvladut;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Vrinceanu Vladut on 23-10-12:36 AM
 * Time 12:36 AM
 */

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if (item != null){
            StockItem inStock = list.getOrDefault(item.getName(), item);
            if(inStock != item){
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)){
            inStock.adjustStock(-quantity);
            inStock.reserve(-quantity);
            return quantity;
        }
        return 0;
    }

    public int reserveStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && ((inStock.quantityInStock() - inStock.getReserved()) >= quantity) && (quantity > 0)){
            inStock.reserve(quantity);
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && ((inStock.getReserved() >= quantity)) && (quantity > 0)){
            inStock.reserve(-quantity);
            return quantity;
        }
        return  0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, Double> PriceList(){
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, StockItem> item: list.entrySet()){
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);  // return readonly map
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item: list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            s = s + String.format("%.2f",itemValue) + ". Reserved: " + stockItem.getReserved() + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + totalCost;
    }
}
