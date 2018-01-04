package sample;

import javafx.scene.control.Label;
import javafx.event.ActionEvent;
public class Controller {

    public Label helloWorld;

    public void sayHelloWorld(ActionEvent actionEvent){

        helloWorld.setText("alo monde");

    }
}
