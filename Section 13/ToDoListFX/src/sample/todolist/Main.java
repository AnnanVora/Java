package sample.todolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.todolist.datamodel.TodoData;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        try {
            TodoData.getInstance().loadTodoItems();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        try {
            TodoData.getInstance().storeTodoItems();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
