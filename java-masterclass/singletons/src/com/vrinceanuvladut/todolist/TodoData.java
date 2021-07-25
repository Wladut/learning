package com.vrinceanuvladut.todolist;

import datamodel.TodoItem;
import javafx.collections.FXCollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vrinceanu Vladut 09-12-2020
 * Time 14:22
 */

public class TodoData {
    private static TodoData instance = new TodoData();
    private static String filename = "TodoListItems.txt";

    private List<TodoItem> todoItems;
    private DateTimeFormatter formatter;

    public static TodoData getInstance(){
        return instance;
    }

    private TodoData(){
        /**
         * Singleton class
         * because TodoData() constructor is private class can't be instantiated
         * the only way to get class instance is to call getInstance() public static method
         */
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // date formatter is case sensitive

    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(List<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    public void loadToDoItems() throws IOException {
        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);

        String input;

        try {
            while((input = br.readLine()) != null){
                String[] itemPieces = input.split("\t");

                String shortDescription = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];

                LocalDate date = LocalDate.parse(dateString, formatter);
                TodoItem todoItem = new TodoItem(shortDescription, details, date);
                todoItems.add(todoItem);

            }

        } finally {
            if(br != null){
                br.close();
            }
        }
    }

    public void storeTodoItems() throws IOException {
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try {
            Iterator<TodoItem> iter = todoItems.iterator();
            while(iter.hasNext()){
                TodoItem item = iter.next();
                bw.write(String.format("%s\t%S\t%s",
                        item.getShortDescription(), item.getDetails(), item.getDeadline().format(formatter)));
                bw.newLine();
            }
        } finally {
            if(bw != null){
                bw.close();
            }
        }










    }

}
