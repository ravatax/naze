package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
    private TextField fld_a;

    @FXML
    private TextField fld_b;

    @FXML
    private TextField fld_c;

    @FXML
    private Label result;
    private String answer = "Error";
	@FXML
    private void calculate(ActionEvent event) {		
        // Button was clicked, do something...
        //outputTextArea.appendText("Button Action\n");
		 try
	        {
	        answer = Resolution.function( Double.valueOf(fld_a.getText()),Double.valueOf(fld_b.getText()),Double.valueOf(fld_c.getText()) );
	        //System.out.println(answer);
	        }
	        catch(Exception e)
	        {

	            answer = "Entrer une valeur numerique";
	        }
    	result.setText(answer);
    }
	public void clear()
    {

        fld_a.setText("");
        fld_b.setText("");
        fld_c.setText("");
        result.setText("");
    }
}
