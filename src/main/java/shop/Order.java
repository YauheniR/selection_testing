package main.java.shop;

public class Order {
    private String id;
    private String date_time;

    public Order(String id, String date_time) {
        this.id = id;
        this.date_time = date_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }
}
