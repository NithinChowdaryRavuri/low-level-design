package fooddeliveryservice;

public class MenuItem {
    private final String id;
    private final String name;
    private final String description;
    private final double price;
    private boolean available;

    public MenuItem(String id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = true;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}
