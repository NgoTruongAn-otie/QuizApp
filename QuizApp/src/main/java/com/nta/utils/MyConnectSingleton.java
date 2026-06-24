/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nta.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class MyConnectSingleton {
    private static MyConnectSingleton instance;
    private Connection connect;
    
    private MyConnectSingleton() {
        try {
            this.connect = DriverManager.getConnection("jdbc:mysql://localhost/quizapp", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnectSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MyConnectSingleton getInstance() {
        if(instance == null)
            instance = new MyConnectSingleton();
        
        return instance;
    }
    
    public Connection connect() {
        return this.connect;
    }
    
    public void close() {
        if(this.connect != null)
            try {
                this.connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnectSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
