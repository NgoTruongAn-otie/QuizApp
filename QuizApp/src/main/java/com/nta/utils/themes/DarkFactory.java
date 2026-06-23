/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nta.utils.themes;

import com.nta.quizapp.App;

/**
 *
 * @author an
 */
public class DarkFactory extends ThemesAbstractFactory{

    @Override
    public String getStyleSheet() {
        return App.class.getResource("darkTheme.css").toExternalForm();
    }
    
}
