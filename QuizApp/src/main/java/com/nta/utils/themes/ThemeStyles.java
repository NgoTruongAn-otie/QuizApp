/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nta.utils.themes;

import com.nta.quizapp.App;
import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public enum ThemeStyles {
    DEFAULT {
        @Override
        public void updateTheme(Scene scene) {
            ThemesManager.setFactory(new DefaultFactory());
            ThemesManager.applyTheme(scene);
        }
    }, LIGHT {
        @Override
        public void updateTheme(Scene scene) {
            ThemesManager.setFactory(new LightFactory());
            ThemesManager.applyTheme(scene);
        }
    }, DARK {
        @Override
        public void updateTheme(Scene scene) {
            ThemesManager.setFactory(new DarkFactory());
            ThemesManager.applyTheme(scene);
        }
    };
    
    public abstract void updateTheme(Scene scene);
}
