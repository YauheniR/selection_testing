package main.java.parser;

import main.java.shop.Order;
import main.java.shop.OrderItem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParseOrderItem {

    public static List<OrderItem> parseOrderCsv(String filePath) throws IOException {
        //Загружаем строки из файла
        List<OrderItem> orders = new ArrayList<OrderItem>();
        List<String> fileLines = Files.readAllLines(Paths.get(filePath));
        for (String fileLine : fileLines) {
            String[] splitedText = fileLine.split(",");

            OrderItem orderItem = new OrderItem(splitedText[0], splitedText[1], Integer.parseInt(splitedText[2]));
            orders.add(orderItem);
        }

        return orders;
    }
}
