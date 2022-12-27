/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerfileonconsole;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class SingleConsoleMonitor implements IConsoleMonitor{
    
    public void InfoFile(String pathNameFile){
    File obj       = new File(pathNameFile);
       System.out.println(obj.getName());
       System.out.println( obj.getPath());
       System.out.println( obj.length());
       System.out.println(obj.lastModified());
       System.out.println(obj.exists());
    }

    private static SingleConsoleMonitor instance;

    private SingleConsoleMonitor() {
    }

    public static SingleConsoleMonitor getInstans() {
        if (instance == null) {
            instance = new SingleConsoleMonitor();
        }
        return instance;
    }

    @Override
    public void UpdateConsoleMonitor(ArrayList<String> list) {
         System.out.print(list);
    }
}
