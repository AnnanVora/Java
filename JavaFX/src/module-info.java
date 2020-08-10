module JavaFX {

    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;
    requires javafx.web;
    requires java.xml;
    requires Icons;

    opens ControlsFX;
    opens EventsFX;
    opens HelloWorldFX;
    opens JavaApplictionFX;
    opens JavaFXChallenge;
    opens JavaFXChallenge.datamodel;
    opens LayoutsFX;
    opens SceneBuilder;
    opens ToDoListFX;
    opens ToDoListFX.datamodel;
}