package main.java.parser;
import main.java.shop.Product;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParseProduct {

    public static List<Product> parseProductCsv(String filePath) throws IOException {
        //Загружаем строки из файла
        List<Product> products = new ArrayList<Product>();
        List<String> fileLines = Files.readAllLines(Paths.get(filePath));
        for (String fileLine : fileLines) {
            String[] splitedText = fileLine.split(",");

            Product product = new Product(splitedText[0], splitedText[1], Integer.parseInt(splitedText[2]));
            products.add(product);
        }

        return products;
    }
}
