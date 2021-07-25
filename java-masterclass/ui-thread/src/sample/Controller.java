package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;

    /** Putem folosi event handler, util in cazul
     * in care nu vrem sa folosim acelasi event handler
     * pentru mai multe controller-e (butoane, text fields)
     * folosing "ActionEvent e" putem sa ne dam seama ce
     * event handler apare (eg. de la care buton)
     */

    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
//        System.out.println("Hello, " + nameField.getText());
//        System.out.println("The following button was pressed: "
//        + e.getSource());
//        //e.getSource() returneaza un obiect care spune ce
//        //buton a fost apasat.
//
//        // va afisa locul de memorie alocat (este diferit
//        // la fiecare run)

        /** Pentru al 2-lea exemplu cu 2 butoane
         */

        if(e.getSource().equals(helloButton)){
            System.out.println("Hello, " + nameField.getText());
        } else if(e.getSource().equals(byeButton)){
            System.out.println("Bye, " + nameField.getText());
        }

        try{
            Thread.sleep(10000);
        } catch (InterruptedException event){
            // we don't care about this
        }
        if(ourCheckBox.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        //text.trim().isEmpty() verifica empty spaces.
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    @FXML
    public void handleChange(){
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }

}
