package com.nta.quizapp;

import com.nta.utils.MyAlertSingleton;
import com.nta.utils.themes.ThemeStyles;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeStyles> cbTheme;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbTheme.setItems(FXCollections.observableArrayList(ThemeStyles.values()));
    }

    public void mangeQuestion(ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("mangeQuestion Comming soon");
    }
    
    public void practice(ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("practice Comming soon");
    }
    
    public void exam(ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("exam Comming soon");
    }

    public void changeTheme(ActionEvent e) {
        switch (this.cbTheme.getSelectionModel().getSelectedItem()) {
            case DARK:
                this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("darkTheme.css").toExternalForm());
                break;
                
            case LIGHT:
                this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("lightTheme.css").toExternalForm());
                break;
                
            default:
                this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
                break;
        }
              
    }
}
