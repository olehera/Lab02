package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private AlienDictionary dizionario;
	
	public AlienController() {
		dizionario = new AlienDictionary();
	}
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    @FXML
    void doTranslate(ActionEvent event) {
    	String s[] = txtWord.getText().trim().toLowerCase().split("\\s+");
    	txtWord.clear();
    	
    	for (int i=0; i<s.length; i++)
    		if (!s[i].matches("[a-z]+")) {
    			txtResult.appendText("Sono ammessi solo caratteri alfabetici.\n");
    			return;
    		}
    	
    	if (s.length == 1) {
    		if (dizionario.translateWord(s[0]) != null)
    			txtResult.appendText(s[0]+" "+dizionario.translateWord(s[0])+"\n");
    		else
    			txtResult.appendText(s[0]+" non è presente nel dizionario.\n");
    	} else if (s.length == 2){
    		dizionario.addWord(s[0], s[1]);
    		txtResult.appendText("Parola aggiunta al dizionario: "+s[0]+" "+s[1]+"\n");
    	}
    		  	
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	txtWord.clear();
    }
    
}
