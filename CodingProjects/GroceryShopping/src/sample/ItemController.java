package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.datamodel.Item;


public class ItemController {
    @FXML
    private TextField nameField;
    @FXML
    private TextField quantityField;
    @FXML
    private TextField urgentField;

    public Item getNewItem() {
        String name = nameField.getText();
        String quantity = quantityField.getText();
        String urgent = urgentField.getText();

        Item newItem = new Item(name, quantity, urgent);
        return newItem;
    }

    public void editItem(Item item) {
        nameField.setText(item.getName());
        quantityField.setText(item.getQuantity());
        urgentField.setText(item.getUrgent());
    }

    public void updateItem(Item item) {
        item.setName(nameField.getText());
        item.setQuantity(quantityField.getText());
        item.setUrgent(urgentField.getText());
    }

}