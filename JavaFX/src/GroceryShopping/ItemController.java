package GroceryShopping;

import GroceryShopping.datamodel.Item;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


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
        return new Item(name, quantity, urgent);
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
