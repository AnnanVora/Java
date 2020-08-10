package GroceryShopping.datamodel;

import javafx.beans.property.SimpleStringProperty;

public class Item {

    private SimpleStringProperty name = new SimpleStringProperty("");
    private SimpleStringProperty quantity = new SimpleStringProperty("");
    private SimpleStringProperty urgent = new SimpleStringProperty("");

    public Item() {}

    public Item(String name, String quantity, String urgent) {
        this.name.set(name);
        this.quantity.set(quantity);
        this.urgent.set(urgent);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getQuantity() {
        return quantity.get();
    }

    public SimpleStringProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity.set(quantity);
    }

    public String getUrgent() {
        return urgent.get();
    }

    public SimpleStringProperty urgentProperty() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent.set(urgent);
    }
}
