package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private GridPane gridPane;

    @FXML
    private Button button4;

    @FXML
    public void initialize(){
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter(){
        label.setScaleX(1.3);
        label.setScaleY(1.3);
    }

    @FXML
    public void handleMouseExit(){
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleClick(){
       // FileChooser choose = new FileChooser();
        /**
         * file chooser window remains open after closing the program
         * multiple file choosers can be opened if button is pressed multiple times.
         */
        //choose.showOpenDialog(null);
        /**
         * getting the window from main scene as parameter you can open only once and
         * window behind is not allowed to interact with
         * decision shall be made here (cancel or selecting file)
         */
        //choose.showOpenDialog(gridPane.getScene().getWindow());

        /**
         * For using directory you need to use DirectoryChooser
         */

        DirectoryChooser chooser = new DirectoryChooser();
        //chooser.showDialog(null);
        File file = chooser.showDialog(gridPane.getScene().getWindow());
        if(file != null){
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled.");
        }
    }
}
