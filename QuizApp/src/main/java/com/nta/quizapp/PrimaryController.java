package com.nta.quizapp;

import com.nta.utils.MyAlertSingleton;
import com.nta.utils.MyStageSingleton;
import com.nta.utils.themes.ThemeStyles;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeStyles> cbTheme;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbTheme.setItems(FXCollections.observableArrayList(ThemeStyles.values()));
    }

    public void mangeQuestion(ActionEvent e) {
        MyStageSingleton.getInstance().showStage("questions");
    }
    
    public void practice(ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("practice Comming soon");
    }
    
    public void exam(ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("exam Comming soon");
    }

    public void changeTheme(ActionEvent e) {
        this.cbTheme.getSelectionModel().getSelectedItem().updateTheme(this.cbTheme.getScene());      
    }
}
