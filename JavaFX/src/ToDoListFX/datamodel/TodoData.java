package ToDoListFX.datamodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodoData {

    private static final TodoData instance = new TodoData();
    private static final String filename  = "TodoListItems.txt";
    private ObservableList<TodoItem> todoItems;
    private final DateTimeFormatter formatter;

    public static TodoData getInstance() {
        return instance;
    }

    private TodoData() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public ObservableList<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void addTodoItem(TodoItem item) {
        todoItems.add(item);
    }

    public void loadTodoItems() throws IOException {
        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);
        String input;

        try {

            while ((input = br.readLine()) != null) {
                String[] itemPieces = input.split(";");
                String shortDescription = itemPieces[0];
                String details = itemPieces[1].replaceAll("###", "\n");
                String dateString = itemPieces[2];
                LocalDate date = LocalDate.parse(dateString, formatter);
                TodoItem todoItem = new TodoItem(shortDescription, details, date);
                todoItems.add(todoItem);
            }
        } finally {
            br.close();
        }
    }

    public void storeTodoItems() throws IOException {
        Path path = Paths.get(filename);
	    BufferedWriter bw = Files.newBufferedWriter(path);
        
	    try  {
            for (TodoItem item : todoItems) {
                bw.write(String.format("%s;%s;%s",
                        item.getShortDescription(),
                        item.getDetails(),
                        item.getDeadLine().format(formatter)));
                bw.newLine();
            }

        } finally {
            bw.close();
        }
    }

    public void deleteTodoItem(TodoItem item) {
        todoItems.remove(item);
    }
}
