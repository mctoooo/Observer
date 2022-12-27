/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerfileonconsole;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ConsoleMonitor implements IConsoleMonitor {

    @Override
    public void UpdateConsoleMonitor(ArrayList<String> list) {
        System.out.print(list);
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     private static ConsoleMonitor instance;

    private ConsoleMonitor() {
    }

    public static ConsoleMonitor getInstans() {
        if (instance == null) {
            instance = new ConsoleMonitor();
        }
        return instance;
    }
}
