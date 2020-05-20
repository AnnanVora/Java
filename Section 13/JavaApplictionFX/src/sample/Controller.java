package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private Button button4;
    @FXML
    private GridPane gridPane;
    @FXML
    private WebView webView;

    public void initialize() {
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2);
        label.setScaleY(2);
    }

    @FXML
    public void handleMouseExit() {
        label.setScaleX(1);
        label.setScaleY(1);
    }

    @FXML
    public void handleClick() {
        FileChooser chooser = new FileChooser();
//        DirectoryChooser chooser = new DirectoryChooser();
//        File file = chooser.showDialog(gridPane.getScene().getWindow());
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text", "*.txt"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Microsoft Power-point", "*.pptx"),
                new FileChooser.ExtensionFilter("Microsoft Excel", "*.xlsx"),
                new FileChooser.ExtensionFilter("Microsoft Access", "*.accdb"),
                new FileChooser.ExtensionFilter("Microsoft Word", "*.docx"),
                new FileChooser.ExtensionFilter("Images", "*.jpg", "*.jpeg", "*.png", "*.gif"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

//        File file = chooser.showOpenDialog(gridPane.getScene().getWindow());
        List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if (file != null) {
            for (File currentFile : file) {
                System.out.println(currentFile.getPath());
            }
        } else {
            System.out.println("Chooser was canceled");
        }
    }
    @FXML
    public void handleLinkClick() {
//        try {
//            Desktop.getDesktop().browse(new URI("https://www.udemy.com"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
        WebEngine engine = webView.getEngine();
        engine.load("http://www.udemy.com");
    }
}
