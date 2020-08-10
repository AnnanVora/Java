package GroceryShopping;

import GroceryShopping.datamodel.Item;
import GroceryShopping.datamodel.ItemData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {
    
    @FXML
    private BorderPane mainPanel;
    @FXML
    private TableView<Item> itemsTable;
    @FXML
    private ToggleButton filterToggleButton;

    private ItemData data;

    public void initialize() {
        data = new ItemData();
        data.loadItems();
        itemsTable.setItems(data.getItems());
    }
    
    @FXML
    public void showAddItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Add New Item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("itemdialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());

        } catch(IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            ItemController itemController = fxmlLoader.getController();
            Item newItem = itemController.getNewItem();
            data.addItem(newItem);
            data.saveItems();
        }
    }
    
    @FXML
    public void showEditItemDialog() {
        Item selectedItem = itemsTable.getSelectionModel().getSelectedItem();
        if(selectedItem == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Item Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select the item you want to edit.");
            alert.showAndWait();
            return;
        }

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Edit Item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("itemdialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        ItemController itemController = fxmlLoader.getController();
        itemController.editItem(selectedItem);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            itemController.updateItem(selectedItem);
            data.saveItems();
        }
    }

    @FXML
    public void showDeleteItemDialog() {
        Item selectedItem = itemsTable.getSelectionModel().getSelectedItem();
        if(selectedItem == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No item Selected");
            alert.setHeaderText(null);
            alert.setContentText("PLease select the item you want to delete.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete item");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to delete the selected item: " +
                selectedItem.getName());

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            data.deleteItem(selectedItem);
            data.saveItems();
        }
    }
}
