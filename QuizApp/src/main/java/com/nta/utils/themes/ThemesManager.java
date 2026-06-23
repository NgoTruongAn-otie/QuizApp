/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nta.utils.themes;

import javafx.scene.Scene;

/**
 *
 * @author an
 */
public class ThemesManager {
    protected static ThemesAbstractFactory factory = new DefaultFactory();

    /**
     * @param aFactory the factory to set
     */
    public static void setFactory(ThemesAbstractFactory aFactory) {
        factory = aFactory;
    }

    public static void applyTheme(Scene scene) {
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(factory.getStyleSheet());
    }
    
    
}
