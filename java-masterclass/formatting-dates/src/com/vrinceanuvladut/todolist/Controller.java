package com.vrinceanuvladut.todolist;

import datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    @FXML
    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthdaycard", "Buy a 30th birthday cad for John",
                LocalDate.of(2016, Month.APRIL,25));
        TodoItem item2 = new TodoItem("Doctor's Appointment", "See Dr. Smith at 123 Main Street. Bring paperwork",
                LocalDate.of(2016, Month.MAY,23));
        TodoItem item3 = new TodoItem("Finish design proposal for client", "I promised Mike I'd email website   mckups by Friday 22nd April",
                LocalDate.of(2016, Month.APRIL,22));
        TodoItem item4 = new TodoItem("Pickup Dug at the train station", "Doug's arriving on March 23 on the 5:00 train",
                LocalDate.of(2016, Month.MARCH,23));
        TodoItem item5 = new TodoItem("Pick up dry cleaning", "The clothes should be ready by Wednesday",
                LocalDate.of(2016, Month.APRIL,20));
        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        /** Generic event   handler for todoListView
         * no need to set this on mouse click
         * event handler on selection model
         */

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem newValue) {
                if(newValue != null) {
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());

                    /**
                     * Using date formatter
                     * Spaces are important in space formatter to keep it readable
                     */

                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d,yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void  handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
    }
}
