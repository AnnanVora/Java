package com.annan.section12.SortedCollections;

import java.util.Map;

public class Main {

    private static final StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 62.50, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.86, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 8.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 82);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket annansBasket = new Basket("Annan");
        sellItem(annansBasket, "Car", 1);
        System.out.println(annansBasket);
        sellItem(annansBasket, "Car", 1);
        System.out.println(annansBasket);
        if (sellItem(annansBasket, "Car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }
        sellItem(annansBasket, "Spanner", 5);
        System.out.println(annansBasket);
        sellItem(annansBasket, "Juice", 4);
        sellItem(annansBasket, "Cup", 12);
        sellItem(annansBasket, "Bread", 1);
        System.out.println(annansBasket);
        System.out.println(stockList);

        System.out.println(stockList);
        for (Map.Entry<String, Double> price : stockList.priceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
