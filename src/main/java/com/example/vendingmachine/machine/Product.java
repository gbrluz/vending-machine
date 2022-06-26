package com.example.vendingmachine.machine;

public class Product {
    private String name;
    private int price;
    private static int maxAmount = 15;
    private int stockAmount;
    private int productsSold = 0;

    public Product(String name, int price, int maxAmount, int stockAmount) {
        this.name = name;
        this.price = price;
        this.maxAmount = maxAmount;
        this.stockAmount = stockAmount;
    }

    public void refill(int qtt){
        if ((stockAmount + qtt) > maxAmount){
            stockAmount = maxAmount;
        }else{
            stockAmount+=qtt;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        Product.maxAmount = maxAmount;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getProductsSold() {
        return productsSold;
    }

    public void productSold() {
        productsSold++;
    }

    public boolean isFull() {
        return stockAmount == maxAmount;
    }

    public int qttLeftToRefill() {
        return maxAmount - stockAmount;
    }

    public void decrementProduct() {
        this.stockAmount--;
    }
}


