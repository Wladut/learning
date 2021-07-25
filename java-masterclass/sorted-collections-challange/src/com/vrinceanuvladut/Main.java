package com.vrinceanuvladut;

import java.util.Map;

/**
 * Created by Vrinceanu Vladut on 22-10-10:24 PM
 * Time 10:24 PM
 */

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
        reserveItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        reserveItem(timsBasket, "car", 1);
        System.out.println(timsBasket);


        if(reserveItem(timsBasket, "car", 1) != 1){
            System.out.println("There are no more cars in stock which can be reserved");
        }

        reserveItem(timsBasket, "car", 1);
        reserveItem(timsBasket, "spanner", 5);
        System.out.println(timsBasket);

        reserveItem(timsBasket, "juice", 4);
        reserveItem(timsBasket, "cup", 12);
        reserveItem(timsBasket, "bread", 1);
        System.out.println(timsBasket);

        System.out.println(stockList);

        System.out.println("=====================");
        unreserveItem(timsBasket, "juice", 3);
        unreserveItem(timsBasket,"bread", 1);

        System.out.println(timsBasket);
        System.out.println(stockList);

        System.out.println("=====================");

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);

        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);
        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

        checkOut(timsBasket);
        System.out.println(stockList);
        System.out.println(timsBasket);
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> item: basket.Items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        System.out.println("Clearing  basket because was checked-out.");
        basket.clear();
    }

    public static int reserveItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem  == null){
            System.out.println("We don't reserve " + item + " because is missing.");
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0){
            System.out.println("Reserved " + quantity + " " + item);
            basket.addToBasket(stockItem,  quantity);
            return quantity;
        }
        return 0;
    }

    public static int unreserveItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We can't unreserve " + item + " beacuse is missing.");
        }
        if(stockList.unreserveStock(item,quantity) !=  0){
            System.out.println("Unreserved " + quantity + " " + item);
            basket.remove(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

}
