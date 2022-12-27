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
public class FileMonitor implements IFileMonitor {

    private ArrayList <ConsoleMonitor> observers;
    
    private ArrayList <FileStatus> fileObj;
    
    FileMonitor(){
    observers = new ArrayList<ConsoleMonitor>();
    fileObj = new ArrayList<FileStatus>();
            }
    public void addFile(String filePath){
        // add is equal & проверку файла с одинаковыми полями
    FileStatus Obj = new FileStatus(filePath);
    fileObj.add(Obj);
    }
    @Override
    public void AddConsoleMonitor(IConsoleMonitor cmObj) {
        if(cmObj!=null)
        { 
            for(IConsoleMonitor Obj:observers){
            if( Obj ==cmObj)
                return;
            }
        
        }
    }

    @Override
    public void DelConsoleMonitor(IConsoleMonitor cmObj) {
       
    }

    @Override
    public void NotifyConsoleMonitor() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    ArrayList<String> list = new ArrayList<String>();
      
        for(FileStatus objF: fileObj)
        {   if(objF.UpdateInfo()==true){
                list.add(objF.getInfomsg());
            }       
        }
        if(!list.isEmpty()){
        for(IConsoleMonitor obj: observers)
        {
            obj.UpdateConsoleMonitor(list);
        }
      } 
    }        
}
