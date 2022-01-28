package main.java.parser;

import main.java.shop.Order;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParseOrder {

    public static List<Order> parseOrderCsv(String filePath) throws IOException {
        //Загружаем строки из файла
        List<Order> orders = new ArrayList<>();
        List<String> fileLines = Files.readAllLines(Paths.get(filePath));
        fileLines.remove(0);
        for (String fileLine : fileLines) {
            String[] splitedText = fileLine.split(",");

            Order order = new Order(splitedText[0], splitedText[1].substring(0, 10));
            orders.add(order);
        }

        return orders;
    }
}
