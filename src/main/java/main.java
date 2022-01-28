package main.java;

import main.java.parser.ParseOrder;
import main.java.parser.ParseOrderItem;
import main.java.parser.ParseProduct;
import main.java.shop.Order;
import main.java.shop.OrderItem;
import main.java.shop.Product;

import java.io.IOException;
import java.util.List;

public class main {

    public static void main(String[] args) throws IOException {
        List<Order> orders = ParseOrder.parseOrderCsv(args[0]);
        List<Product> products = ParseProduct.parseProductCsv(args[1]);
        List<OrderItem> orderItems = ParseOrderItem.parseOrderCsv(args[2]);



    }
}
