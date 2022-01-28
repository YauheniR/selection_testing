package main.java;

import main.java.parser.ParseOrder;
import main.java.parser.ParseOrderItem;
import main.java.parser.ParseProduct;
import main.java.shop.Order;
import main.java.shop.OrderItem;
import main.java.shop.Product;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args){
        try {
            List<Order> orders = ParseOrder.parseOrderCsv("/home/yauheni/IdeaProjects/selection_testing/src/main/java/data/orders.csv");
            List<Product> products = ParseProduct.parseProductCsv("/home/yauheni/IdeaProjects/selection_testing/src/main/java/data/products.csv");
            List<OrderItem> orderItems = ParseOrderItem.parseOrderCsv("/home/yauheni/IdeaProjects/selection_testing/src/main/java/data/order_items.csv");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
