package main.java.shop;

public class OrderItem {

    private String order;
    private String product;
    private Integer count;

    public OrderItem(String order, String product, Integer count) {
        this.order = order;
        this.product = product;
        this.count = count;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}