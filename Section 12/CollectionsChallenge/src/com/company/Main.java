package com.company;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();
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

        Basket annansBasket = new Basket("Annan");

        sellItem(annansBasket, "Car", 1);
        System.out.println(annansBasket);

        sellItem(annansBasket, "Car", 1);
        System.out.println(annansBasket);

        if (sellItem(annansBasket, "Car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(annansBasket, "Spanner", 5);
        sellItem(annansBasket, "Juice", 4);
        sellItem(annansBasket, "Cup", 12);
        sellItem(annansBasket, "Bread", 1);

        Basket basket = new Basket("Customer");
        sellItem(basket, "Cup", 100);
        sellItem(basket, "Juice", 5);
        sellItem(basket, "Cup", 1);
        removeItem(basket, "Cup", 1);
        System.out.println(basket);

        removeItem(annansBasket, "Car", 1);
        removeItem(annansBasket, "Cup", 9);
        removeItem(annansBasket, "Car", 1);
        System.out.println("Cars removed " + removeItem(annansBasket, "Car", 1));
        System.out.println(annansBasket);
        removeItem(annansBasket, "Bread", 1);
        removeItem(annansBasket, "Cup", 3);
        removeItem(annansBasket, "Juice", 4);
        removeItem(annansBasket, "Cup", 3);
        System.out.println(annansBasket);
        System.out.println("\nDisplay basket before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(annansBasket);
        System.out.println(annansBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
