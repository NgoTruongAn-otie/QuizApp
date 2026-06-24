/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nta.utils;

import com.nta.quizapp.App;
import com.nta.utils.themes.ThemesManager;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStageSingleton {

    private static MyStageSingleton instance;
    private Stage stage;

    private MyStageSingleton() {
        stage = new Stage();
        stage.setTitle("Quiz App");
    }

    public static MyStageSingleton getInstance() {
        if (instance == null) {
            instance = new MyStageSingleton();
        }

        return instance;
    }

    public void showStage(String fxml) {
        if (!stage.isShowing()) {
            try {
                Scene scene = new Scene(new FXMLLoader(App.class.getResource(fxml + ".fxml")).load());
                
                ThemesManager.applyTheme(scene);
                
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
