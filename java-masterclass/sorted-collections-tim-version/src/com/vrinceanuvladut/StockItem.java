package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 22-10-10:34 PM
 * Time 10:34 PM
 */

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0; // or here(but you wouldn't normally do both)
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityStock;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >= 0){
            this.quantityInStock = newQuantity;
        }
    }

    public int  reserveStock(int quantity){
        if(quantity <= availableQuantity()){
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity){
        if(quantity <= reserved){
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finalizeStock(int quantity){
        if(quantity <= reserved){
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Entering StockItem.equals");
        if(o == this){
            return true;
        }

        if((o == null) || (o.getClass() != this.getClass())){
            return false;
        }

        String objName = ((StockItem) o).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        //System.out.println("Entering StockItem.compareTo");
        if(this == o){
            return 0;
        }
        if( o!= null){
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price + ". Reserved: " + this.reserved;
    }

}
