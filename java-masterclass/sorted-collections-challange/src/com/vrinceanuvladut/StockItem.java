package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 22-10-10:34 PM
 * Time 10:34 PM
 */

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock = 0;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0){
            this.price = price;
        }
    }

    public void reserve(int quantity){
        int newReserved = this.reserved + quantity;
        if(newReserved <= this.quantityStock && newReserved >= 0){
            this.reserved = newReserved;
        }
    }

    public int getReserved(){
        return this.reserved;
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0){
            this.quantityStock = newQuantity;
        }
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
        System.out.println("Entering StockItem.compareTo");
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
        return this.name + " : price " + this.price;
    }
}
